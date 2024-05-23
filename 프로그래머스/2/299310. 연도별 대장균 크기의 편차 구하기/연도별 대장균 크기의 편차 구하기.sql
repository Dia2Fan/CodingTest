-- 코드를 작성해주세요 --
select Year(DIFFERENTIATION_DATE) as YEAR,(maxColony-SIZE_OF_COLONY) as YEAR_DEV,ID
from ecoli_data join (select YEAR(DIFFERENTIATION_DATE) as YEAR,Max(size_of_colony) as maxColony from ecoli_data group by YEAR) as ed on Year(DIFFERENTIATION_DATE) = ed.YEAR
order by YEAR,YEAR_DEV