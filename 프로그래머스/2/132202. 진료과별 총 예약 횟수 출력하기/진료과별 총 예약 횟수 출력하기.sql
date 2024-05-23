-- 코드를 입력하세요
SELECT MCDP_CD as '진료과코드',count(APNT_NO) as '5월예약건수'
from appointment
where APNT_YMD >= '2022-05-01' and APNT_YMD < '2022-06-01'
group by MCDP_CD
order by count(APNT_NO),MCDP_CD