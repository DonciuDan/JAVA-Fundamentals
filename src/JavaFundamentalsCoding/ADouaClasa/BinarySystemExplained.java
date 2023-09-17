package JavaFundamentalsCoding.ADouaClasa;

public class BinarySystemExplained {
    // Binary System Explained
    //0000 0001
    //1 * 2 ** 0 + 0 * 2 ** 1 + 0 * 2 ** 2 + 0 * 2 ** 3 + 0 * 2 ** 4 + 0 * 2 ** 5 + 0 * 2 ** 6 + 0 * 2 ** 7
    //    1      +  0   +  0      +  0      +  0      +  0      +  0      +  0      = 1
    //0000 0010
    //0 * 2 ** 0 + 1 * 2 ** 1 + 0 * 2 ** 2 + 0 * 2 ** 3 + 0 * 2 ** 4 + 0 * 2 ** 5 + 0 * 2 ** 6 + 0 * 2 ** 7
    //   0      +  2   +  0      +  0      +  0      +  0      +  0      +  0      = 2

    //0000 0011
    //1 * 2 ** 0 + 1 * 2 ** 1 + 0 * 2 ** 2 + 0 * 2 ** 3 + 0 * 2 ** 4 + 0 * 2 ** 5 + 0 * 2 ** 6 + 0 * 2 ** 7
    //    1      +  2   +  0      +  0      +  0      +  0      +  0      +  0      = 3

    // we read the bits from right to left with powers starting at 0 and increasing by 1
    //example: 0000 0111

    // 1 * 2 ** 0 + 1 * 2 ** 1 + 1 * 2 ** 2 + 0 * 2 ** 3 + 0 * 2 ** 4 + 0 * 2 ** 5 + 0 * 2 ** 6 + 0 * 2 ** 7
    // coefieciets  read from right : 1, 1, 1, 0, 0, 0, 0, 0 and we give them powers starting from 0 and increasing by 1

    // 0000 1111 equals 1 + 2 + 4 + 8 = 15
    // 1 0 0 0 0 0 0 1 = 1 + 128 = 129
}
