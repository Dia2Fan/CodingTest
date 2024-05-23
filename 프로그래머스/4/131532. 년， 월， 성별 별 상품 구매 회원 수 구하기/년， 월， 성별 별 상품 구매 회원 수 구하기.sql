-- 코드를 입력하세요
SELECT year(os.sales_date) as year,month(os.sales_date) as month,gender,count(distinct ui.user_id) as users
from user_info as ui join ONLINE_SALE as os
 on ui.user_id = os.user_id
where gender is not null
 group by year(os.sales_date), month(os.sales_date),gender
 order by year(os.sales_date),month(os.sales_date),gender