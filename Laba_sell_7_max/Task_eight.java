public class Task_eight {

    public static String decompress(String compressedText) {
        StringBuilder decompressedText = new StringBuilder();

        int i = 0;
        while (i < compressedText.length()) {
            char currentChar = compressedText.charAt(i);
            decompressedText.append(currentChar);

            int count = 1;
            while (i + 1 < compressedText.length() && compressedText.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

            if (count > 1) {
                decompressedText.append(count);
            }

            i++;
        }

        return decompressedText.toString();
    }

    public static void main(String[] args) {
        String compressedText = "hellowoooorld";
        System.out.println("Изначальный текст:" + compressedText);
        System.out.println("Переобразованный текст:" + decompress(compressedText));
    }

}