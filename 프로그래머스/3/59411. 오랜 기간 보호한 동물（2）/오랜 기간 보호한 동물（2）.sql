-- 코드를 입력하세요
SELECT ai.ANIMAL_id,ai.name
from animal_ins as ai join animal_outs as ao on ai.animal_id = ao.animal_id
order by DATEDIFF(ai.DATETIME,ao.DateTime) 
limit 2