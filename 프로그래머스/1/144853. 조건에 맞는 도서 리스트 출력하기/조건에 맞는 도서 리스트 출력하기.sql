-- 코드를 입력하세요
SELECT BOOK_ID,DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') as PUBLISHED_DATE
from book
where PUBLISHED_DATE like '2021%' and category ='인문'
order by PUBLISHED_DATE