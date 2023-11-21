# Unit-test6

AverageCalculatorTest:
testCompareAverages_FirstListGreater: проверяет случай, когда первый список имеет большее среднее значение, чем второй.
testCompareAverages_SecondListGreater: проверяет случай, когда второй список имеет большее среднее значение, чем первый.
testCompareAverages_EqualAverages: проверяет случай, когда средние значения обоих списков равны.
testCompareAverages_EmptyList: проверяет обработку случая, когда один из списков пуст.
testCompareAverages_NullList: проверяет обработку случая, когда один из списков равен null.
testCompareAverages_FirstListEmpty: проверяет обработку случая, когда первый список пуст.
testCompareAverages_SecondListEmpty: проверяет обработку случая, когда второй список пуст.
testCompareAverages_BothListsEmpty: проверяет обработку случая, когда оба списка пусты.
testCalculateAverage_ListWithNegativeValues: проверяет правильность вычисления среднего значения для списка с отрицательными значениями.
testCalculateAverage_NullList: проверяет обработку случая, когда список равен null.
testCalculateAverage_EmptyList: проверяет обработку случая, когда список пуст.

MainTest:
testMain_SecondListGreater: проверяет, что метод main выводит правильное сообщение, когда второй список имеет большее среднее значение.
testMain_DifferentAverages: проверяет, что метод main выводит правильное сообщение, когда средние значения списков различны.

Выбор этих тестов обусловлен желанием охватить различные возможные ситуации,
такие как различные значения среднего, пустые списки и списки с отрицательными значениями. 
Это обеспечивает хорошее тестовое покрытие и убеждает в том, что код корректно обрабатывает разнообразные входные данные.
