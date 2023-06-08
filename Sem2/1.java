public static void main(String[] args) {
        read();
        }

static void read(){
        File file = new File("text.txt");
        Scanner scanner = null;
        try {
        scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNext()){
        String line = scanner.nextLine();
        line = checkLine(line);
        stringBuilder.append(line);
        stringBuilder.append("\n");
        }
        scanner.close();
        try (FileWriter writer = new FileWriter("text.txt")){
        writer.write(stringBuilder.toString());
        } catch (IOException e){
        e.printStackTrace();
        }
        }

static String checkLine(String line){
        String[] strings = line.split("=");
        char[] chars = strings[1].toCharArray();
        for (int i = 0; i < chars.length; i++) {
        if (!(Character.isDigit(chars[i]) || chars[i] == '?')){
        throw new RuntimeException("некорректная запись");
        }
        }
        if (strings[1].equals("?")){
        strings[1] = String.valueOf(strings[0].length());
        }
        return strings[0] + "=" + strings[1];
        }