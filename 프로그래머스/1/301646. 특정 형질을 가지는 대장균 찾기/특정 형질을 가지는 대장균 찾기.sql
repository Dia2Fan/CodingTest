-- 코드를 작성해주세요 --
select count(*) as COUNT
from Ecoli_data
where (genotype > 2 and bin(genotype) like '%0_' and (bin(genotype) like '%1' or bin(genotype) like '%1__')) or(bin(genotype) like '1')