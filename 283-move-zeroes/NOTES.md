# 답지풀이
문제는 투포인터를 사용하라고 했음.     
투포인터를 사용한 답안지를 보면, 포인터 하나를 만들고 그 포인터를 맨 앞부터 1씩 증가하며 배열 중에 0이 아닌 애들을 이 포인터인덱스에다가 넣어주는 것임.        
인덱스에다가 넣어주면 이 포인터++ 시킴.       

그럼 원래 배열이 0이 하나도 없지 않은 이상 포인터길이가 배열길이보다 짧음.
그럼 그 차이만큼 배열뒤에다 0으로 메꾸는 것임.       

#  내풀이
난 버블알고리즘을 이용했음. 이러면 O(n2)이긴 한데 이게 뭔가 간지나서...그랬음..