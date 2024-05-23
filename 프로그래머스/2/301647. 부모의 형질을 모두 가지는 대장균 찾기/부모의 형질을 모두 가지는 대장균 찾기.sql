-- 코드를 작성해주세요 --

SELECT e.ID, e.GENOTYPE, p.GENOTYPE AS PARENT_GENOTYPE
FROM ECOLI_DATA e
JOIN ECOLI_DATA p ON e.PARENT_ID = p.ID
WHERE e.PARENT_ID IS NOT NULL AND (e.GENOTYPE & p.GENOTYPE) = p.GENOTYPE
ORDER BY e.ID;


-- select ecoli_data.id,ecoli_data.genotype,edd.genotype as parent_genotype
-- from ecoli_data join (select ecoli_data.id,ecoli_data.genotype 
--                        from ecoli_data join 
--                                    (select parent_id from ecoli_data) 
--                        as ed on ecoli_data.id =  ed.parent_id 
--                        group by ecoli_data.id, ecoli_data.genotype 
--                        order by ecoli_data.id, ecoli_data.genotype ) 
-- as edd on ecoli_data.parent_id = edd.id
-- where ecoli_data.parent_id is not null and (ecoli_data.genotype & edd.genotype) = edd.genotype
-- order by ecoli_data.id