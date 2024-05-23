-- 코드를 입력하세요
SELECT I.FLAVOR
from ICECREAM_INFO as I join FIRST_HALF as F on I.FLAVOR = F.FLAVOR
where F.TOTAL_ORDER>3000 and I.INGREDIENT_TYPE ='fruit_based'
order by F.TOTAL_ORDER desc