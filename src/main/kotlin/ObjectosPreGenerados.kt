import domain.*
import java.time.LocalTime

val prof1 = Profesor("Juan","Perez","35681323")
val prof2= Profesor("Gonzalo","Perez","48756242")
val prof3 = Profesor("Juana","Torres","43007792")
val prof4 = Profesor("Nicolás","Fernandez","16486163")
val prof5 = Profesor("Carlos","Ruiz","44389574")
val prof6= Profesor("Mario","Sosa","24887544")
val prof7 = Profesor("Mónica","Alvarez","27682079")
val prof8 = Profesor("Graciela","Romero","46692498")
val prof9 = Profesor("Juana","Gutierrez","38070208")
val prof10= Profesor("María","Sanchez","44313784")
val prof11 = Profesor("Luis","Herrera","34361095")
val prof12 = Profesor("Hector","Gimenez","36672113")
val prof13 = Profesor("Carlos","Romero","31328350")
val prof14= Profesor("Natalia ","Fernandez","49237124")
val prof15 = Profesor("Juan","Sosa","32556920")
val prof16 = Profesor("Nicolás","Suarez","12672786")
val prof17 = Profesor("Horacio","Gomez","46417804")
val prof18 = Profesor("Víctor ","Lopez","43488070")
val prof19 = Profesor("Liliana","Gimenez","49031436")
val prof20 = Profesor("Hector","Gomez","19011882")

val listaProfesores = mutableListOf(prof1,prof2,prof3,prof4,prof5,prof6,prof7,prof8,prof9,prof10,prof11,prof12,prof13,
    prof14,prof15,prof16,prof17,prof18,prof19,prof20)

//Tecnicatura Universitaria en Diagnóstico por Imágenes
val fisica_1 = Materia("Fisica I", mutableListOf(prof1,prof7))
val matematica_1 = Materia("Matematica I", mutableListOf(prof2))
val anatomia_fisiologia_1 = Materia("Anatomia Y Fisiologia", mutableListOf(prof3))
val introduccion_computacion = Materia("Introduccion a la computacion", mutableListOf(prof4,prof14))
val fisica_2 = Materia("Fisica II", mutableListOf(prof5))
val matematica_2 = Materia("Matematica II", mutableListOf(prof6))
val anatomia_fisiologia_2 = Materia("Anatomia Y Fisiologia II", mutableListOf(prof7))
val leng_prog = Materia("Lenguajes de Programacion", mutableListOf(prof8))
val phsi_1 = Materia("Practica Hospitalaria en Servicios de Imagenes I", mutableListOf(prof9,prof3))
val fisica_3 = Materia("Fisica III", mutableListOf(prof10))
val teg_imagenes_1 = Materia("Tecnología de las Imágenes I", mutableListOf(prof11))
val enf_y_erg = Materia("Enfermería y Ergometría", mutableListOf(prof12))
val proc_digital_img = Materia("Procesamiento Digital de Imágenes", mutableListOf(prof13))
val prob_estads = Materia("Probabilidad y Estadística", mutableListOf(prof14))
val radioproteccion = Materia("Radioprotección", mutableListOf(prof15))
val phsi_2 = Materia("Practica Hospitalaria en Servicios de Imagenes II", mutableListOf(prof16,prof20))
val teg_imagenes_2 = Materia("Tecnología de las Imágenes II", mutableListOf(prof17))
val et_deon = Materia("Ética y Deontología", mutableListOf(prof18))
val teg_imagenes_3 = Materia("Tecnología de las Imágenes III", mutableListOf(prof19))
val radioquimica = Materia("Radioquímica", mutableListOf(prof20))
val phsi_3 = Materia("Practica Hospitalaria en Servicios de Imagenes III", mutableListOf(prof1))
val final_DI = Materia("Proyecto final integrador(Tecnicatura Universitaria en Diagnóstico por Imágenes)", mutableListOf(prof2,prof8))
val teg_imagenes_4 = Materia("Tecnología de las Imágenes IV", mutableListOf(prof3))
val phsi_4 = Materia("Practica Hospitalaria en Servicios de Imagenes IV", mutableListOf(prof4))

//Tecnicatura Universitaria en Electromedicina

val comp_1 = Materia("Computación I", mutableListOf(prof5))
val laMejorMateria = Materia("Electricidad y Magnetismo", mutableListOf(prof6))
val med_elec = Materia("Medidas Electrónicas", mutableListOf(prof7))
val taller_elec_1 = Materia("Taller de Electrónica I", mutableListOf(prof8))
val biofisica = Materia("Biofísica", mutableListOf(prof9))
val elec_ap_1 = Materia("Electrónica Aplicada I", mutableListOf(prof10))
val inst_elecmedica_1 = Materia("Instrumentación Electromédica I", mutableListOf(prof11,prof17))
val taller_elec_2 = Materia("Taller de Electrónica II", mutableListOf(prof12))
val radiof_radioprot = Materia("Radiofísica y Radioprotección", mutableListOf(prof13))
val elec_ap_2 = Materia("Electrónica Aplicada II", mutableListOf(prof14))
val inst_elecmedica_2 = Materia("Instrumentación Electromédica II", mutableListOf(prof15))
val taller_electromedicina_1 = Materia("Taller de Electromedicina I", mutableListOf(prof16))
val proc_adq_anl_seniales = Materia("Procesamiento, Adquisición y Análisis de Señales", mutableListOf(prof17,prof2))
val elec_ap_3 = Materia("Electrónica Aplicada III", mutableListOf(prof18))
val inst_elecmedica_3 = Materia("Instrumentación Electromédica III", mutableListOf(prof19))
val taller_electromedicina_2 = Materia("Taller de Electromedicina II", mutableListOf(prof20))
val final_EM = Materia("Proyecto Final Integrador(Tecnicatura Universitaria en Electromedicina)", mutableListOf(prof1,prof8))


//Tecnicatura Universitaria en Programación Informática

val labo_1 = Materia("Laboratorio de Computación I", mutableListOf(prof2))
val labo_2 = Materia("Laboratorio de Computación II", mutableListOf(prof3))
val spd = Materia("Sistemas de Procesamiento de Datos", mutableListOf(prof4))
val algo_1 = Materia("Algoritmos I", mutableListOf(prof5))
val mate_3 = Materia("Matemática III", mutableListOf(prof6))
val caso = Materia("Conceptos de Arquitecturas y Sistemas Operativos", mutableListOf(prof7,prof20))
val algo_2 = Materia("Algoritmos II", mutableListOf(prof8))
val redes = Materia("Redes Locales", mutableListOf(prof9))
val met_num = Materia("Métodos Numéricos", mutableListOf(prof10))
val algo_3 = Materia("Algoritmos III", mutableListOf(prof11))
val bd = Materia("Bases de Datos", mutableListOf(prof12))
val seminario = Materia("Seminario de Programación Concurrente, Paralela y Distribuida", mutableListOf(prof13))
val phm = Materia("Programación con Herramientas Modernas", mutableListOf(prof14,prof11))
val proy_soft = Materia("Proyectos de Software", mutableListOf(prof15))
val parad_prog = Materia("Paradigmas de Programación", mutableListOf(prof16))

//Tecnicatura Universitario en Redes Informáticas

val red_info_1 = Materia("Redes de Información I", mutableListOf(prof17))
val proy_1 = Materia("Proyecto I", mutableListOf(prof18))
val red_info_2 = Materia("Redes de Información  II", mutableListOf(prof19))
val adm_rede_comp = Materia("Administración de Redes de Computadoras", mutableListOf(prof20,prof5))
val proy_2 = Materia("Proyecto II", mutableListOf(prof1))
val red_info_3 = Materia("Redes de Información III", mutableListOf(prof2))
val sac = Materia("Sistemas Avanzados de Comunicación", mutableListOf(prof3))
val proy_3 = Materia("Proyecto III", mutableListOf(prof4))

//Ingeniería en Transporte

val int_an_mate = Materia("Introducción al Análisis Matemático", mutableListOf(prof5))
val cts = Materia("Ciencia, Tecnología y Sociedad", mutableListOf(prof6))
val quim_general = Materia("Química General", mutableListOf(prof7))
val int_info = Materia("Introducción a la Informática", mutableListOf(prof8))
val calc_1 = Materia("Cálculo I", mutableListOf(prof9))
val aga1 = Materia("Álgebra y Geometría Analítica I", mutableListOf(prof10))
val int_trans = Materia("Introducción al Transporte", mutableListOf(prof11))
val calc_2 = Materia("Cálculo II", mutableListOf(prof12))
val srg = Materia("Sistemas de Representación Gráfica", mutableListOf(prof13))
val aga2 = Materia("Álgebra y Geometría Analitica II", mutableListOf(prof14))
val calc_avan = Materia("Cálculo Avanzado", mutableListOf(prof15))
val sis_trans = Materia("Sistemas de Transporte", mutableListOf(prof16))
val hsal = Materia("Higiene y seguridad ambiental y laboral", mutableListOf(prof17))
val est_tec = Materia("Estadística Técnica", mutableListOf(prof18))
val materiales = Materia("Materiales", mutableListOf(prof19))
val termodinamica = Materia("Termodinámica", mutableListOf(prof20))
val mec_fluid = Materia("Mecánica de los Fluídos", mutableListOf(prof1))
val erm = Materia("Estática y Resistencia de Materiales", mutableListOf(prof2))
val SITCT = Materia("Sistemas Inteligentes y Tecnología de la Comunicación en el Transporte", mutableListOf(prof3,prof6))
val elec_analg = Materia("Electrónica Analógica", mutableListOf(prof4))
val trans_carr = Materia("Transporte Carretero", mutableListOf(prof5))
val trans_ferro = Materia("Transporte Ferroviario", mutableListOf(prof6))
val trans_mar = Materia("Transporte Marítimo y Fluvial", mutableListOf(prof7))
val trans_aero = Materia("Transporte Aéreo", mutableListOf(prof8))
val mcat = Materia("Métodos Cuantitativos aplicados al transporte", mutableListOf(prof9,prof10,prof2))
val teg_veh = Materia("Tecnología Vehicular", mutableListOf(prof10))
val mov_urbana = Materia("Movilidad Urbana", mutableListOf(prof11))
val LGA = Materia("Logística y Cadena de Abastecimiento", mutableListOf(prof12))
val lrt = Materia("Legislación y Regulación del Transporte", mutableListOf(prof13))
val inv_op = Materia("Investigación Operativa", mutableListOf(prof14))
val seg_trans = Materia("Seguridad en el Transporte", mutableListOf(prof15))
val log_inter = Materia("Logística Internacional", mutableListOf(prof16))
val ing_trans = Materia("Ingeniería de Tránsito", mutableListOf(prof17))
val tepp = Materia("Transporte, Estado y Políticas Públicas", mutableListOf(prof18))
val gept = Materia("Gestión y Evaluación de Proyectos de Transporte", mutableListOf(prof19))
val pps = Materia("Práctica Profesional Supervisada", mutableListOf(prof20))
val tema = Materia("Transporte, Energía y Medio Ambiente", mutableListOf(prof1))
val final_it = Materia("Proyecto Final Integrador(Ingeniería en Transporte)", mutableListOf(prof2))

val edificio_01 = Edificio("Tornavias", -58.5263602, -34.5786899,"tornavias","https://unsam.edu.ar/prensa/fotos/gr/16.jpg")

val geo_aula1 = "m144.39 44.407c-0.87509-0.32136-3.7184-1.2114-5.027-1.5737-0.92809-0.2569-3.733-0.95656-4.5971-1.1467-0.22537-0.04959-0.26136-0.08075-0.24281-0.21024 0.0229-0.15965 2.7696-11.361 2.8186-11.494 0.0333-0.0905 0.44444-0.0053 2.809 0.58186 3.7263 0.92537 9.528 2.745 9.4767 2.9723-0.0117 0.05179-1.0081 2.5721-2.2144 5.6006-1.582 3.9721-2.2212 5.5056-2.2939 5.5033-0.0554-0.0019-0.38348-0.10715-0.72908-0.23407z"
val geo_aula2 = "m134.11 68.544c-1.3719-0.46918-2.6314-0.84084-4.2333-1.2491-1.4318-0.36491-1.6508-0.43738-1.6323-0.53996 0.053-0.29434 3.0152-11.038 3.0564-11.086 0.11834-0.13738 4.2677 0.93317 7.027 1.813 1.0917 0.34811 1.234 0.40941 1.1814 0.50905-0.0329 0.0623-1.0927 2.4945-2.355 5.4048-1.2623 2.9104-2.3149 5.3104-2.3389 5.3331-0.0241 0.02289-0.34138-0.06018-0.70518-0.1846z"
val geo_aula3 = "m133.71 41.462c-0.49119-0.12887-3.5901-0.66764-5.0601-0.8797-1.8448-0.26614-4.1984-0.52397-5.8705-0.64301l-1.141-0.08125-1e-3 -0.30183c-1e-3 -0.33374 0.53895-11.737 0.55723-11.758 6e-3 -0.0075 0.57584 0.02998 1.2656 0.08325 3.3155 0.256 6.4444 0.64296 9.5884 1.1858 1.3131 0.22671 3.6851 0.68786 3.7205 0.72331 0.0147 0.01474-2.7937 11.545-2.8464 11.686-8e-3 0.02117-0.10367 0.01503-0.21281-0.0136z"
val geo_aula4 = "m126.4 66.534c-1.397-0.27172-3.5536-0.57152-4.9939-0.69423-1.6625-0.14166-1.554-0.11304-1.5562-0.4106-3e-3 -0.41846 0.46741-10.681 0.50276-10.969l0.0333-0.27117 0.31162 0.02376c0.1714 0.01307 0.92 0.06972 1.6636 0.12589 1.3985 0.10563 3.0969 0.28842 4.3034 0.46312 1.6344 0.23665 3.9523 0.65166 4.0203 0.71987 0.0144 0.01434-0.66113 2.526-1.5011 5.5816-0.83994 3.0554-1.5272 5.5728-1.5272 5.5945 0 0.06459-0.25092 0.0319-1.2568-0.16372z"
val geo_aula5 = "m108.91 39.935c-0.044-0.136-1.491-11.916-1.4667-11.94 0.0348-0.03478 2.3875-0.2055 4.0094-0.29093 2.462-0.12968 10.012-0.07082 10.144 0.07908 0.0265 0.03003-0.54308 11.979-0.57237 12.008-0.01 0.0098-1.0587-0.01603-2.331-0.05738-2.862-0.093-7.1267 0.02019-9.3749 0.24884-0.2818 0.02866-0.38835 0.01635-0.40893-0.04729z"
val geo_aula14 = "m151.55 188.33c-1.3086-2.7138-2.4532-5.0855-2.5434-5.2702l-0.16404-0.33596 1.3741-0.58835c1.4946-0.63991 5.5355-2.6038 6.9071-3.3567 0.79086-0.43415 0.86613-0.45783 0.99022-0.31183 0.27998 0.32945 6.6399 9.455 6.6407 9.5286 3e-3 0.2138-5.903 3.216-8.8513 4.4994-0.97214 0.42322-1.814 0.7694-1.8709 0.76929-0.0568-1e-4 -1.174-2.2206-2.4827-4.9344z"
val geo_aula13 = "m161.93 182.82c-1.8609-2.6551-3.3705-4.8392-3.3546-4.8532 0.0159-0.0142 0.51305-0.31168 1.1047-0.66116 2.2642-1.3374 5.4202-3.4504 7.2495-4.8537 0.41159-0.31572 0.79626-0.60351 0.85481-0.63949 0.099-0.0609 7.9374 8.479 8.0332 8.7523 0.0963 0.27469-5.3128 4.0608-8.8981 6.2285-0.77729 0.4699-1.4567 0.85438-1.5098 0.85438s-1.6191-2.1724-3.48-4.8275z"
val geo_aula17 = "m132.83 172.42c-0.056-0.19293-0.76424-2.7953-1.5739-5.7829l-1.4722-5.4321 0.8452-0.21443c1.0872-0.27585 4.038-1.2348 5.2368-1.702 0.51183-0.19942 0.96169-0.33093 0.99974-0.29225 0.085 0.0864 5.2257 10.68 5.2257 10.769 0 0.0769-2.0974 0.87798-3.8354 1.4648-1.1847 0.40005-5.0667 1.5405-5.2437 1.5405-0.0444 0-0.12645-0.15785-0.18242-0.35078z"
val geo_aula18 = "m99.905 172.81c-8.3208-2.1359-14.749-4.8881-21.234-9.0912-1.2692-0.82255-3.461-2.3723-3.461-2.4472 0-0.056 6.9712-7.5659 7.8104-8.4142l0.50148-0.50678 1.3865 0.93989c5.5347 3.752 11.783 6.4994 18.141 7.9768l0.85266 0.19811-1.3915 5.5845c-0.76533 3.0715-1.4129 5.6792-1.4391 5.7948-0.0571 0.25225-0.0477 0.25253-1.1666-0.0347z"
val geo_aula21 = "m81.522 194.84c-0.1029-0.0426-1.0921-0.43158-2.1983-0.86435-4.8148-1.8838-9.763-4.3211-14.265-7.0264-2.4051-1.4452-7.5302-4.9209-7.5302-5.1069 0-0.0782 8.1197-9.2574 8.1888-9.2574 0.02299 0 0.45802 0.30977 0.96675 0.68839 5.1027 3.7975 11.997 7.58 18.299 10.04 0.72029 0.28114 1.3449 0.54535 1.3881 0.5871 0.06353 0.0614-4.1473 10.067-4.5481 10.807-0.08787 0.16224-0.1566 0.19256-0.30096 0.13279z"
val geo_aula22 = "m56.546 181.16c-1.5238-1.1914-2.818-2.2453-4.0219-3.2752-1.5007-1.284-5.3826-4.9003-5.3728-5.0051 0.0033-0.0346 2.1396-1.9212 4.7474-4.1923l4.7413-4.1293 1.5902 1.5574c1.7943 1.7573 3.7115 3.4562 5.6239 4.9842 0.71402 0.57039 1.3101 1.0477 1.3247 1.0606 0.02886 0.0256-8.0755 9.1785-8.1895 9.2489-0.03836 0.0237-0.23791-0.0884-0.44346-0.24908z"
val geo_aula23 = "m45.402 171.06c-2.8974-3.1287-5.3736-6.1779-7.7263-9.5148l-0.42973-0.60952 5.4562-3.3427c3.0009-1.8385 5.4771-3.3427 5.5025-3.3427 0.02551 0 0.49527 0.63163 1.0439 1.4036 2.0118 2.8307 3.4626 4.6108 6.4843 7.9557l0.46915 0.51931-4.7082 4.1089c-2.5896 2.2599-4.7429 4.1184-4.7849 4.1298-0.04219 0.0116-0.63034-0.57678-1.307-1.3074z"
val geo_aula24 = "m35.986 159.04c-1.1667-1.816-2.0074-3.2136-2.9659-4.9302-1.0843-1.942-2.6268-5.0355-2.5454-5.1053 0.03702-0.0317 2.6982-1.2063 5.9139-2.6102 3.2157-1.404 5.8734-2.5677 5.9067-2.5862 0.0331-0.0184 0.52575 0.90274 1.0948 2.0471 1.1367 2.2862 2.2878 4.3373 3.6232 6.456l0.87089 1.3819-0.34554 0.21594c-0.44328 0.27701-10.522 6.4383-10.603 6.4817-0.03347 0.018-0.46079-0.58985-0.94958-1.3507z"
val geo_aula19 = "m73.664 160.13c-3.5631-2.885-6.4954-5.7506-9.218-9.0087-0.96577-1.1558-2.99-3.8282-2.9887-3.9457 0.0011-0.0797 10.66-6.4341 10.696-6.3766 0.24486 0.38526 1.8959 2.5223 2.6109 3.3792 1.8248 2.1874 5.0432 5.271 7.5794 7.2622 0.62446 0.49021 0.63266 0.50233 0.46772 0.69127-0.4772 0.54659-8.1083 8.7211-8.1562 8.737-0.03096 0.0103-0.47722-0.32205-0.99173-0.7386z"
val geo_aula20 = "m56.017 137.72c-0.85719-1.9641-1.1974-2.8043-1.7126-4.2298-0.63232-1.7497-1.2182-3.6338-1.1508-3.7012 0.04548-0.0455 11.805-2.8458 12.074-2.8752 0.1393-0.0152 0.26506 0.26861 0.71849 1.6215 0.30231 0.90192 0.84687 2.351 1.2101 3.2202 0.36327 0.8692 0.64661 1.5942 0.62967 1.6112-0.01693 0.0169-2.4686 1.0353-5.4482 2.263-2.9794 1.2277-5.5771 2.2996-5.7726 2.3821l-0.35533 0.14991z"
val geo_aula16 = "m140.06 164.13-2.636-5.4355 0.25062-0.11564c2.5239-1.1645 3.4197-1.5962 4.3187-2.0814 0.68743-0.37096 1.1165-0.55154 1.1907-0.50106 0.0638 0.0434 1.6324 2.3058 3.4858 5.0276 3.2125 4.7172 3.3612 4.9548 3.1845 5.0786-0.59962 0.42-5.8837 2.9924-6.9714 3.394-0.16976 0.0627-0.43129-0.4345-2.8231-5.3665z"
val geo_aula15 = "m154.36 155.75c-2.3246-2.4658-4.2232-4.5153-4.2195-4.5545 4e-3 -0.0392 0.47495-0.45011 1.0469-0.91315 1.2769-1.0337 4.482-4.2031 5.7226-5.6594 1.071-1.2569 2.5975-3.2647 3.4255-4.5053 0.32059-0.48035 0.59575-0.88891 0.61147-0.90794 0.0358-0.0433 10.889 5.8686 11.061 6.0253 0.10375 0.0943-9e-3 0.31606-0.63664 1.253-2.0943 3.126-4.4322 5.9385-7.4363 8.9457-1.7591 1.761-4.2433 4.0121-5.1035 4.6246l-0.24549 0.17481z"
val geo_aula10 = "m168.14 109.5c-0.016-0.0537-0.0562-0.3712-0.0893-0.70563-0.11659-1.1765-0.60395-3.8396-0.98754-5.3958-0.55454-2.2499-1.8864-6.2018-2.4575-7.2918l-0.13682-0.26113 5.9467-2.4139c3.2707-1.3276 5.9774-2.3816 6.015-2.3421 0.11001 0.11577 1.0445 2.3875 1.6072 3.9071 1.3613 3.6761 2.3745 7.7628 2.9175 11.767 0.11998 0.88499 0.20107 1.6269 0.1802 1.6488-0.0969 0.10133-12.968 1.1779-12.995 1.0869z"
val geo_aula9 = "m163.91 94.492c-0.19882-0.44146-0.70638-1.4229-1.1279-2.181-1.7985-3.2344-3.6899-5.9378-6.0282-8.6159-0.5166-0.59167-0.93948-1.1001-0.93975-1.1298-7.9e-4 -0.08922 9.0859-8.1545 9.2009-8.1667 0.24454-0.0258 3.1208 3.272 4.8529 5.564 2.1028 2.7827 4.2687 6.2919 5.7933 9.3867 0.43976 0.89267 0.52394 1.1322 0.41865 1.1911-0.22014 0.12319-11.646 4.7542-11.73 4.7542-0.0429 0-0.24074-0.3612-0.43957-0.80266z"
val geo_aula7 = "m96.479 41.883c-0.21466-0.69928-3.1382-11.624-3.1165-11.646 0.10233-0.10233 4.0616-0.90812 6.219-1.2657 2.2795-0.37782 4.8884-0.72246 6.8129-0.9l0.46301-0.04272 0.71926 5.844c0.3956 3.2141 0.73342 5.9221 0.75072 6.0173 0.0312 0.17223 0.0276 0.17385-0.48775 0.21952-2.7339 0.24223-7.3648 0.9894-10.305 1.6626-0.54363 0.12448-0.99554 0.22634-1.0042 0.22634-0.0087 0-0.03183-0.05209-0.05138-0.11575z"
val geo_aula8 = "m77.564 73.069-4.2423-4.3838 1.443-1.0671c3.8854-2.8733 8.5361-5.5295 13.079-7.4702 1.6714-0.71389 2.0779-0.82636 2.2129-0.61232 0.09097 0.14422 1.1927 2.5253 2.4483 5.2913l2.2829 5.0291-3.2893 1.631c-3.1885 1.5811-6.2436 3.4382-8.4541 5.1392-0.5907 0.45452-1.111 0.82642-1.1563 0.82642-0.04524 0-1.9912-1.9727-4.3246-4.3838z"
val geo_aula6 = "m81.906 40.401c-1.4081-3.0271-2.5094-5.5498-2.4474-5.6064 0.13832-0.12604 1.7653-0.74961 4.1737-1.5996l1.812-0.63954 0.25985 0.68778c0.14292 0.37827 1.1283 2.9178 2.1898 5.6432 1.0614 2.7254 1.9299 4.9916 1.9299 5.036 0 0.04445-0.34231 0.18738-0.76067 0.31808-0.59163 0.18482-2.7593 0.9682-4.4428 1.6057-0.09449 0.03577-1.1461-2.0738-2.7143-5.4453z"
val geo_aula6bis = "m88.253 37.98c-1.2098-3.1186-2.1995-5.6916-2.1993-5.7176 7.93e-4 -0.11885 6.6396-1.9899 6.71-1.8911 0.05329 0.07475 3.1482 11.655 3.1297 11.711-0.01278 0.03835-0.62563 0.22782-1.3618 0.42105-0.73622 0.19324-1.9447 0.53122-2.6855 0.75106-0.74074 0.21984-1.3574 0.39901-1.3701 0.39814-0.01273-7.94e-4 -1.013-2.5532-2.2228-5.6721z"
val geo_aula12 = "m172.41 175.82c-2.1644-2.389-3.9467-4.3806-3.9608-4.4259-0.014-0.0453 0.47974-0.49727 1.0971-1.0044 1.917-1.5748 3.2908-2.8225 5.435-4.936l2.0675-2.0379 9.3976 7.603-1.2005 1.216c-1.925 1.9498-3.4448 3.4083-4.8545 4.6582-1.5355 1.3615-3.851 3.271-3.9663 3.271-0.044 0-1.8508-1.9547-4.0153-4.3436z"
val geo_aula11 = "m183.57 167.9c-1.7941-1.4504-3.9047-3.1588-4.6902-3.7965l-1.4282-1.1593 0.96966-1.0933c2.0828-2.3484 4.3836-5.321 6.0954-7.8752 0.49995-0.74601 0.91931-1.3675 0.93191-1.3811 0.0269-0.0291 10.443 5.8546 10.562 5.966 0.17846 0.16754-3.5385 5.3832-5.7991 8.1372-1.1076 1.3494-2.9988 3.5239-3.2358 3.7205-0.12212 0.10132-0.62822-0.27295-3.4054-2.5181z"

val geo_aula25 = "m95.365 158.91c-8.3208-2.1359-14.749-4.8881-21.234-9.0912-1.2692-0.82255-3.461-2.3723-3.461-2.4472 0-0.056 6.9712-7.5659 7.8104-8.4142l0.50148-0.50678 1.3865 0.93989c5.5347 3.752 11.783 6.4994 18.141 7.9768l0.85266 0.19811-1.3915 5.5845c-0.76533 3.0715-1.4129 5.6792-1.4391 5.7948-0.0571 0.25225-0.0477 0.25253-1.1666-0.0347z"
val geo_aula26 = "m69.123 146.23c-3.5631-2.885-6.4954-5.7506-9.218-9.0087-0.96577-1.1558-2.99-3.8282-2.9887-3.9457 0.0011-0.0797 10.66-6.4341 10.696-6.3766 0.24486 0.38526 1.8959 2.5223 2.6109 3.3792 1.8248 2.1874 5.0432 5.271 7.5794 7.2622 0.62446 0.49021 0.63266 0.50233 0.46772 0.69127-0.4772 0.54659-8.1083 8.7211-8.1562 8.737-0.03096 0.0103-0.47722-0.32205-0.99173-0.7386z"
val geo_aula27 = "m55.598 131.63c-2.4565-3.6757-4.1093-7.1899-5.6499-10.947-0.5465-1.3326-1.6122-4.3508-1.5734-4.456 0.02648-0.0713 12.491-3.081 12.507-3.0183 0.10912 0.42086 0.98087 3.1994 1.385 4.1871 1.0314 2.5212 2.7647 6.0602 4.5331 8.6205 0.43543 0.63033 0.65028 0.566 0.43362 0.68603-0.6268 0.34724-10.826 6.034-10.877 6.0338-0.03263-1.1e-4 -0.4045-0.56785-0.75922-1.0986z"
val geo_aula28 = "m60.467 173.03c-1.5238-1.1914-0.66102-0.40991-2.0013-1.2547-1.6673-1.0508-5.5697-3.7324-5.5599-3.8372 0.0033-0.0346 2.4301-2.714 4.7317-5.2442l3.5452-4.001 2.545 1.8017c2.0499 1.4511 2.7276 1.9623 4.8833 3.2861 0.71402 0.33488 0.54467 0.27456 0.59847 0.3032-0.01039 0.15121-7.3129 9.6878-7.4269 9.7582-0.03836 0.0237-0.31088-0.1628-0.51642-0.32348z"
val geo_aula29 = "m52.005 167.27c-1.5238-1.1914-2.818-2.2453-4.0219-3.2752-1.5007-1.284-5.3826-4.9003-5.3728-5.0051 0.0033-0.0346 2.1396-1.9212 4.7474-4.1923l4.7413-4.1293 1.5902 1.5574c1.7943 1.7573 3.7115 3.4562 5.6239 4.9842 0.71402 0.57039 1.3101 1.0477 1.3247 1.0606 0.02886 0.0256-8.0755 9.1785-8.1895 9.2489-0.03836 0.0237-0.23791-0.0884-0.44346-0.24908z"

val geo_lab_ter = "m197.19 143.16c-3.0612-1.1486-5.6035-2.104-5.6498-2.123s0.16976-0.68489 0.48002-1.4798c0.72239-1.8507 1.6884-4.7908 2.2674-6.9005 0.42762-1.5581 0.46662-1.6532 0.67257-1.6391 0.38724 0.0264 11.816 2.2984 11.888 2.3634 0.14435 0.12954-1.2576 4.9953-2.2391 7.771-0.95775 2.7088-1.542 4.1166-1.7038 4.106-0.0822-5e-3 -2.654-0.94961-5.7152-2.0982z"
val geo_lab_elec = "m200.79 131.55c-3.2414-0.64489-5.8993-1.1774-5.9068-1.1832-7e-3 -6e-3 0.0869-0.45269 0.20968-0.99289 0.55736-2.4528 1.1145-6.0314 1.358-8.7229l0.11636-1.2862 0.33403-5.3e-4c0.71749-1e-3 10.029 0.28344 11.034 0.33752l1.065 0.0573-0.0637 0.94878c-0.19674 2.9292-0.84787 7.3659-1.5704 10.701-0.26233 1.2107-0.30688 1.3321-0.48593 1.3235-0.10841-5e-3 -2.849-0.53709-6.0904-1.182z"
val geo_lab_neuro = "m202.85 118.95-6.174-0.18065v-4.2158c0-2.7461-0.043-4.6839-0.12324-5.558-0.0678-0.73826-0.10987-1.3537-0.0935-1.3676 0.0769-0.0655 12.247-1.1 12.301-1.0456 0.24604 0.24605 0.51562 9.4622 0.3397 11.613l-0.0765 0.93543z"
val geo_lab_bio = "m196.26 106.1c-0.31154-2.5722-0.8942-5.838-1.4477-8.1144-0.12504-0.51429-0.21732-0.94511-0.20505-0.95736 0.0388-0.03882 11.763-2.9249 11.882-2.9249 0.38317 0 2.4941 11.436 2.1707 11.759-0.0511 0.0511-11.379 1.1195-12.137 1.1448-0.12322 4e-3 -0.17316-0.16836-0.26262-0.90698z"
val geo_lab_bio2 = "m194.11 95.299c-0.68238-2.4756-2.0495-6.3343-3.1337-8.8446l-0.33506-0.77583 0.39576-0.16957c3.9563-1.6952 10.86-4.5021 10.921-4.4404 0.27572 0.27961 2.2971 5.4416 3.1638 8.0792 0.57388 1.7465 1.2316 3.9936 1.2293 4.2002-1e-3 0.11991-1.1655 0.43595-5.8697 1.5935-3.2276 0.79414-5.9102 1.4575-5.9618 1.4741-0.0514 0.01662-0.23578-0.4858-0.40963-1.1165z"
val geo_lab_qui = "m189.9 84.065c-0.26624-0.57525-0.90179-1.8336-1.4123-2.7963-2.9842-5.6276-6.7211-10.911-11.022-15.583l-0.88711-0.96386 0.22668-0.21771c0.12468-0.11974 2.1837-1.8496 4.5754-3.8441l4.3489-3.6263 0.92093 0.9727c4.6846 4.9482 9.4193 11.58 12.875 18.036 0.86404 1.614 2.1854 4.3137 2.1346 4.3613-0.0243 0.02278-10.627 4.4545-11.077 4.6302-0.18265 0.07123-0.24057-0.01077-0.68365-0.96807z"
val geo_lab_fi = "m173.47 125.32-6.1787-1.226 0.21098-1.0426c0.23549-1.1637 0.53503-3.1617 0.68656-4.5799 0.15097-1.4128 0.21746-5.5414 0.11223-6.969-0.0512-0.69455-0.0807-1.2759-0.0656-1.2918 0.0804-0.0846 12.884-1.156 12.953-1.0839 0.044 0.0461 0.13198 1.0099 0.19557 2.1418 0.24093 4.2886-0.0833 9.0783-0.90555 13.377-0.34816 1.8202-0.38047 1.9191-0.62306 1.909-0.11378-5e-3 -2.9874-0.5603-6.3854-1.2346z"
val geo_ing_ener = "m147.94 161.81c-1.4406-2.1193-2.9842-4.3888-3.4305-5.0437l-0.81126-1.1904 0.95156-0.58218c1.3108-0.802 2.7302-1.754 3.911-2.6233 0.54731-0.4029 1.015-0.73254 1.0394-0.73254 0.0769 0 8.4422 8.9103 8.4422 8.992 0 0.25993-6.5846 4.7212-7.3712 4.9942-0.0639 0.0222-1.2399-1.6201-2.7315-3.8144z"
val geo_labo_comp_4 = "m191.16 155.08c-2.881-1.6364-5.2736-2.9884-5.3167-3.0046s0.13142-0.36774 0.38782-0.78118c1.3642-2.1996 3.349-5.9808 4.4148-8.4102 0.27083-0.61737 0.52427-1.1579 0.56321-1.2011 0.0987-0.10952 11.504 4.1484 11.504 4.2949 0 0.36978-2.5743 5.6938-3.9092 8.0848-0.76781 1.3752-2.2384 3.8486-2.341 3.9375-0.0352 0.0304-2.4212-1.2835-5.3024-2.9199z"

val geo_aula32 = "m147.76 173.76c-0.99647-2.0807-2.3566-4.4971-2.7918-5.4105l-0.76911-1.6606 0.67935-0.30395c2.8492-1.2747 4.484-2.0366 7.2471-3.3855 0.82702-0.40375 1.2181-0.83669 1.4233-0.56783 0.9741 1.276 6.7344 9.4012 6.7936 9.5527 0.0891 0.22798-3.8102 2.1518-7.035 3.6668-1.5801 0.7423-3.4452 1.682-3.7437 1.7576-0.15381 0.039-0.26119-0.31664-1.8037-3.5375z"
val geo_aula33 = "m52.945 76.387c2.05 0.7979 4.7154 2.1901 5.6139 2.541l1.5207 0.63512-0.49754 1.1777c-0.71856 1.7008-1.0082 2.8502-1.5462 4.5643-0.15356 0.48958-0.1977 0.96186-0.51097 0.88254-1.4873-0.37626-12.052-3.5095-12.192-3.5717-0.2119-0.09357 0.67354-2.8407 1.4094-4.7022 0.38954-0.98546 1.4518-3.3626 1.5899-3.4954 0.07092-0.06858 1.4068 0.39624 4.5439 1.9436z"
val geo_cidi = "m158.49 168.32c-1.2597-1.9327-2.8961-4.1507-3.4469-4.9994l-1.0294-1.3683 1.1112-0.65652c2.6873-1.5878 4.1947-2.6394 6.7094-4.4087 0.74222-0.5222 1.3814-1.2939 1.62-1.0542 1.1324 1.1378 7.8215 8.5658 7.9 8.7083 0.11812 0.21439-3.6685 2.8753-6.6678 4.7986-1.4696 0.94235-3.4957 2.2647-3.7818 2.3787-0.1474 0.0588-0.47794-0.39637-2.428-3.3882z"
val geo_lab_elect_IV = "m169.04 160.98c-1.5212-1.7345-3.4614-3.7824-4.127-4.5444l-1.0022-1.1862 1.1733-0.94628c2.4296-1.9595 3.739-3.291 5.9773-5.3992 0.66064-0.6222 1.3004-1.6128 1.5706-1.4093 1.2824 0.96563 9.0883 7.3172 9.1861 7.4471 0.14734 0.19547-3.3654 3.6383-6.0615 5.9676-1.321 1.1413-3.5387 3.0319-3.8057 3.1853-0.13757 0.0791-0.55137-0.42654-2.9061-3.1114z"
val geo_lab_elect_I = "m188.13 139.83c-2.0211-1.1125-4.5428-2.377-5.4282-2.8666l-1.4296-0.90709 0.85294-1.4226c1.605-2.677 2.261-4.0959 3.6473-6.8405 0.40917-0.81004 0.81203-2.2424 1.1354-2.1432 1.5346 0.47101 11.043 4.061 11.179 4.1499 0.20512 0.13359-1.8691 4.6004-3.6104 7.7089-0.8532 1.523-2.3885 4.2226-2.5874 4.4578-0.1024 0.12124-0.62484-0.41302-3.7534-2.1352z"
val geo_lab_comp2 = "m194.27 127.67c-2.1603-0.80954-4.8047-1.786-5.7515-2.1429l-1.5843-0.50281 0.67778-1.7194c1.1447-2.9039 1.3916-4.3513 2.3677-7.2671 0.28812-0.86056 0.11392-1.0872 0.44821-1.0356 1.5865 0.24484 11.557 2.2268 11.705 2.295 0.22223 0.10259-0.86442 3.6673-1.873 7.0609-0.49734 1.6734-1.6494 4.6061-1.8122 4.8674-0.0839 0.13474-0.83327-0.31862-4.1774-1.5717z"
val geo_lab_comp = "m198.14 115.82c-2.2625-0.4512-5.0462-1.0004-6.0381-1.2002l-1.7167-0.30228 0.50314-1.8338c0.82587-3.0101 0.57092-4.5029 1.0649-7.5378 0.14582-0.89572 0.0553-1.6094 0.3934-1.6123 1.6052-0.0141 11.891 0.3529 12.047 0.39647 0.23585 0.0654-0.40406 4.2453-0.8532 7.757-0.22146 1.7316-0.9141 4.9392-1.0327 5.2234-0.0611 0.14649-0.86259-0.20253-4.3649-0.90093z"
val geo_lab_im = "m175.06 103.58c-2.3109-0.0956-5.3992-0.85575-6.4125-0.89885l-1.7535-0.23318 0.0798-1.1513c0.13372-1.929 0.11359-2.6435 0.0623-4.5245-0.0147-0.53721-0.0902-1.1474 0.24832-1.175 1.6073-0.13143 12.539-0.98339 12.7-0.96942 0.24266 0.02091 0.163 3.0561 0.15332 5.1525-5e-3 1.0506 9e-3 4.3174-0.0829 4.4959-0.0471 0.092-1.356-0.22172-5.0039-0.69145z"
val geo_lab_comp3 = "m174.97 94.368c-2.1728 0.34378-5.1947 0.31309-6.1476 0.46272l-1.7415 0.12612-0.1484-1.1951c-0.22753-1.8323-0.33926-2.9564-0.73832-4.708-0.11405-0.50026-0.22066-0.95757 0.0899-1.0469 1.4743-0.42443 12.098-3.1553 12.251-3.1724 0.23018-0.02595 0.70357 2.9393 1.006 4.918 0.16009 1.0475 0.4974 4.0299 0.44502 4.2142-0.0267 0.09497-1.5335 0.1632-5.0229 0.40733z"
val geo_lab_biomed = "m164.72 129.97c-1.8577-1.0356-4.1452-2.3048-4.9589-2.7605l-1.4217-0.75198 0.9976-1.4023c1.6375-2.3017 1.8639-3.6355 3.2164-6.0542 0.39919-0.71385 0.53509-1.3425 0.83394-1.247 1.419 0.45268 12.108 4.3908 12.233 4.4729 0.1881 0.12346-1.5684 3.5999-3.0254 6.434-0.71847 1.3975-2.7849 4.1557-2.9753 4.3612-0.0981 0.10595-2.0178-1.4568-4.8935-3.0599z"
val geo_lab_opt = "m171.68 110.6c-1.7908-0.25972-3.9167-0.77596-4.7017-0.89085l-1.2159-0.25394 0.2466-1.0144c0.40997-1.6864 0.44835-2.3147 0.6698-3.9512 0.0658-0.48623-8e-3 -1.3745 0.26189-1.3722 1.2827 0.0105 12.899 1.8094 13.022 1.8338 0.18602 0.0366-0.21894 2.1536-0.47238 4.0075-0.12587 0.9207-0.39272 2.8684-0.49782 3.0148-0.0541 0.0755-4.5487-0.977-7.3208-1.379z"
val geo_lab_elect3 = "m178.93 151.68c-1.7934-1.4513-4.0528-3.2188-4.8381-3.8568l-1.2046-0.93622 1.561-1.7125c2.1027-2.3068 3.1265-3.8776 4.9747-6.335 0.54552-0.72525 1.341-2.3928 1.6418-2.2382 1.4276 0.73407 10.242 5.8192 10.361 5.9306 0.17836 0.16765-2.9824 4.6783-5.2443 7.4312-1.1082 1.3489-3.5503 4.2155-3.7875 4.412-0.12216 0.10129-0.68231-0.44626-3.4584-2.6928z"
val geo_lab_cie_hum = "m79.553 174.92c0.96898-2.0574 1.8834-4.372 2.2869-5.2876l0.69295-1.4358 0.70871 0.22722c2.9723 0.95294 4.6896 1.5288 7.6794 2.2467 0.91668 0.2201 2.1013 0.32366 2.0746 0.66085-0.12655 1.6003-2.4159 11.181-2.473 11.334-0.08586 0.22922-3.7788-0.69031-7.1912-1.7151-1.672-0.50214-5.2422-1.7227-5.515-1.8657-0.14055-0.0737 0.5036-0.9125 1.7408-4.1363z"

val cidi = Aula("Centro de Investigacion y Desarrollos Informaticos", Piso.PRIMER_PISO.value,"CIDI", geo_cidi,edificio_01)
val lab_elect4 = Aula("Laboratorio de Electronica IV", Piso.PRIMER_PISO.value,"Lab.Elc. IV", geo_lab_elect_IV,edificio_01)
val lab_elect1 = Aula("Laboratorio de Electronica I", Piso.PRIMER_PISO.value,"Lab.Elc. I", geo_lab_elect_I,edificio_01)
val lab_comp2 = Aula("Laboratorio de Computacion II", Piso.PRIMER_PISO.value,"Lab.C. II", geo_lab_comp2,edificio_01)
val lab_comp = Aula("Laboratorio de Computacion I", Piso.PRIMER_PISO.value,"Lab.C. I", geo_lab_comp,edificio_01)
val lab_im = Aula("Laboratorio de Imagenes", Piso.PRIMER_PISO.value,"Lab.Img", geo_lab_im,edificio_01)
val lab_comp3 = Aula("Laboratorio de Computacion III", Piso.PRIMER_PISO.value,"Lab.C. III", geo_lab_comp3,edificio_01)
val lab_biomed = Aula("Laboratorio de Biomedica", Piso.PRIMER_PISO.value,"Lab.Biom", geo_lab_biomed,edificio_01)
val lab_opt = Aula("Laboratorio de Optica", Piso.PRIMER_PISO.value,"Lab.Opt", geo_lab_opt,edificio_01)
val lab_elect3 = Aula("Laboratorio de Electronica III", Piso.PRIMER_PISO.value,"Lab.Elc. III", geo_lab_elect3,edificio_01)
val lab_cie_hum= Aula("Laboratorio de Ciencias Humanas", Piso.PRIMER_PISO.value,"Lab. CH", geo_lab_cie_hum,edificio_01)

val lab_ter = Aula("Laboratorio de Termodinamica", Piso.PLANTA_BAJA.value,"Lab. Term.", geo_lab_ter,edificio_01)
val lab_elec = Aula("Laboratorio de Electronica II", Piso.PLANTA_BAJA.value,"Lab.Elc. II", geo_lab_elec,edificio_01)
val lab_neuro = Aula("Laboratorio de Neuroingenieria", Piso.PLANTA_BAJA.value,"Lab. Neuro.", geo_lab_neuro,edificio_01)
val lab_bio1 = Aula("Laboratorio de Biologia", Piso.PLANTA_BAJA.value,"Lab. Bio.", geo_lab_bio,edificio_01)
val lab_bio2 = Aula("Laboratorio de Biologia", Piso.PLANTA_BAJA.value,"Lab. Bio.", geo_lab_bio2,edificio_01)
val lab_qui = Aula("Laboratorio de Quimica", Piso.PLANTA_BAJA.value,"Lab. Qui.", geo_lab_qui,edificio_01)
val lab_fi = Aula("Laboratorio de Fisica", Piso.PLANTA_BAJA.value,"Lab. Fis.", geo_lab_fi,edificio_01)
val ing_en = Aula("Ingenieria en Energia", Piso.PLANTA_BAJA.value,"Ing. Eng.", geo_ing_ener,edificio_01)
val labo4 = Aula("Laboratorio de Computacion IV", Piso.PLANTA_BAJA.value,"Lab.C. IV", geo_labo_comp_4,edificio_01)

val aula_01 = Aula("Aula 1",Piso.PLANTA_BAJA.value,"A1",geo_aula1,edificio_01)
val aula_02 = Aula("Aula 2",Piso.PLANTA_BAJA.value,"A2",geo_aula2,edificio_01)
val aula_03 = Aula("Aula 3",Piso.PLANTA_BAJA.value,"A3",geo_aula3,edificio_01)
val aula_04 = Aula("Aula 4",Piso.PLANTA_BAJA.value,"A4",geo_aula4,edificio_01)
val aula_05 = Aula("Aula 5",Piso.PLANTA_BAJA.value,"A5",geo_aula5,edificio_01)
val aula_06 = Aula("Aula 6",Piso.PLANTA_BAJA.value,"A6",geo_aula6,edificio_01)
val aula_06Bis = Aula("Aula 6 Bis",Piso.PLANTA_BAJA.value,"A6B",geo_aula6bis,edificio_01)
val aula_07 = Aula("Aula 7",Piso.PLANTA_BAJA.value,"A7",geo_aula7,edificio_01)
val aula_08 = Aula("Aula 8",Piso.PLANTA_BAJA.value,"A8",geo_aula8,edificio_01)
val aula_09 = Aula("Aula 9",Piso.PLANTA_BAJA.value,"A9",geo_aula9,edificio_01)
val aula_10 = Aula("Aula 10",Piso.PLANTA_BAJA.value,"A10",geo_aula10,edificio_01)
val aula_11 = Aula("Aula 11",Piso.PLANTA_BAJA.value,"A11",geo_aula11,edificio_01)
val aula_12 = Aula("Aula 12",Piso.PLANTA_BAJA.value,"A12",geo_aula12,edificio_01)
val aula_13 = Aula("Aula 13",Piso.PLANTA_BAJA.value,"A13",geo_aula13,edificio_01)
val aula_14 = Aula("Aula 14",Piso.PLANTA_BAJA.value,"A14",geo_aula14,edificio_01)
val aula_15 = Aula("Aula 15",Piso.PLANTA_BAJA.value,"A15",geo_aula15,edificio_01)
val aula_16 = Aula("Aula 16",Piso.PLANTA_BAJA.value,"A16",geo_aula16,edificio_01)
val aula_17 = Aula("Aula 17",Piso.PLANTA_BAJA.value,"A17",geo_aula17,edificio_01)
val aula_18 = Aula("Aula 18",Piso.PLANTA_BAJA.value,"A18",geo_aula18,edificio_01)
val aula_19 = Aula("Aula 19",Piso.PLANTA_BAJA.value,"A29",geo_aula19,edificio_01)
val aula_20 = Aula("Aula 20",Piso.PLANTA_BAJA.value,"A20",geo_aula20,edificio_01)
val aula_21 = Aula("Aula 21",Piso.PLANTA_BAJA.value,"A21",geo_aula21,edificio_01)
val aula_22 = Aula("Aula 22",Piso.PLANTA_BAJA.value,"A22",geo_aula22,edificio_01)
val aula_23 = Aula("Aula 23",Piso.PLANTA_BAJA.value,"A23",geo_aula23,edificio_01)
val aula_24 = Aula("Aula 24",Piso.PLANTA_BAJA.value,"A24",geo_aula24,edificio_01)
val aula_25 = Aula("Aula 25",Piso.SUB_SUELO.value,"A25",geo_aula25,edificio_01)
val aula_26 = Aula("Aula 26",Piso.SUB_SUELO.value,"A26",geo_aula26,edificio_01)
val aula_27 = Aula("Aula 27",Piso.SUB_SUELO.value,"A27",geo_aula27,edificio_01)
val aula_28 = Aula("Aula 28",Piso.SUB_SUELO.value,"A28",geo_aula28,edificio_01)
val aula_29 = Aula("Aula 29",Piso.SUB_SUELO.value,"A29",geo_aula29,edificio_01)
val aula_32 = Aula("Aula 32",Piso.PRIMER_PISO.value,"A32",geo_aula32,edificio_01)
val aula_33 = Aula("Aula 33",Piso.PRIMER_PISO.value,"A33",geo_aula33,edificio_01)

val listaAulas = listOf(aula_01,aula_02,aula_03,aula_04,aula_05,aula_06,aula_06Bis,aula_07,aula_08,aula_09,aula_10,aula_11,aula_12,
    aula_13,aula_14,aula_15,aula_16,aula_17,aula_18,aula_19,aula_20,aula_21,aula_22,aula_23,aula_24,ing_en,labo4,
    aula_25,aula_26,aula_27,aula_28,aula_29,aula_32,aula_33,lab_ter,lab_elec,lab_neuro,lab_bio1,lab_bio2,lab_qui,lab_fi,
    cidi,lab_elect4,lab_elect1,lab_comp2,lab_comp,lab_im,lab_comp3,lab_biomed,lab_opt,lab_elect3,lab_cie_hum)

val asignacion_01 = Asignacion(fisica_1,aula_01,1, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_02 = Asignacion(matematica_1,aula_01,1, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_03 = Asignacion(anatomia_fisiologia_1,aula_01,1, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_04 = Asignacion(introduccion_computacion,aula_01,2, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_05 = Asignacion(fisica_2,aula_01,2, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_06 = Asignacion(matematica_2,aula_01,2, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_07 = Asignacion(anatomia_fisiologia_2,aula_01,3, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_08 = Asignacion(leng_prog,aula_01,3, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_09 = Asignacion(phsi_1,aula_01,3, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_10 = Asignacion(fisica_3,aula_01,3, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_11 = Asignacion(teg_imagenes_1,aula_01,4, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_12 = Asignacion(enf_y_erg,aula_01,4, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_13 = Asignacion(proc_digital_img,aula_01,4, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_14 = Asignacion(prob_estads,aula_01,5, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_15 = Asignacion(radioproteccion,aula_01,5, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_16 = Asignacion(phsi_2,aula_01,5, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_17 = Asignacion(teg_imagenes_2,aula_02,1, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_18 = Asignacion(et_deon,aula_02,1, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_19 = Asignacion(teg_imagenes_3,aula_02,3, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_20 = Asignacion(radioquimica,aula_02,3, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_21 = Asignacion(phsi_3,aula_02,4, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_22 = Asignacion(final_DI,aula_02,4, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_23 = Asignacion(teg_imagenes_4,aula_02,5, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_24 = Asignacion(phsi_4,aula_03,1, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_25 = Asignacion(comp_1,aula_03,1, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_26 = Asignacion(laMejorMateria,aula_03,3, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_27 = Asignacion(med_elec,aula_03,4, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_28 = Asignacion(taller_elec_1,aula_03,5, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_29 = Asignacion(biofisica,aula_04,2, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_30 = Asignacion(elec_ap_1,aula_04,2, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_31 = Asignacion(inst_elecmedica_1,aula_04,3, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_32 = Asignacion(taller_elec_2,aula_04,4, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_33 = Asignacion(radiof_radioprot,aula_04,5, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_34 = Asignacion(elec_ap_2,aula_05,1, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_35 = Asignacion(inst_elecmedica_2,aula_05,1, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_36 = Asignacion(taller_electromedicina_1,aula_05,2, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_37 = Asignacion(proc_adq_anl_seniales,aula_05,2, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_38 = Asignacion(elec_ap_3,aula_05,4, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_39 = Asignacion(inst_elecmedica_3,aula_05,5, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_40 = Asignacion(taller_electromedicina_2,aula_05,5, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_41 = Asignacion(final_EM,aula_05,5, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_42 = Asignacion(labo_1,aula_06,1, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_43 = Asignacion(labo_2,aula_06,1, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_44 = Asignacion(spd,aula_06,1, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_45 = Asignacion(algo_1,aula_06,2, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_46 = Asignacion(mate_3,aula_06,2, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_47 = Asignacion(caso,aula_06,2, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_48 = Asignacion(algo_2,aula_06,3, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_49 = Asignacion(redes,aula_06,3, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_50 = Asignacion(met_num,aula_06,3, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_51 = Asignacion(algo_3,aula_06,4, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_52 = Asignacion(bd,aula_06,4, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_53 = Asignacion(seminario,aula_06,4, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_54 = Asignacion(phm,aula_06,5, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_55 = Asignacion(proy_soft,aula_06,5, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_56 = Asignacion(parad_prog,aula_06,5, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_57 = Asignacion(red_info_1,aula_07,1, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_58 = Asignacion(proy_1,aula_07,1, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_59 = Asignacion(red_info_2,aula_07,1, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_60 = Asignacion(adm_rede_comp,aula_07,2, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_61 = Asignacion(proy_2,aula_07,3, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_62 = Asignacion(red_info_3,aula_07,3, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_63 = Asignacion(sac,aula_07,4, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_64 = Asignacion(proy_3,aula_07,5, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_65 = Asignacion(int_an_mate,aula_07,5, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_66 = Asignacion(cts,aula_08,1, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_67 = Asignacion(quim_general,aula_08,1, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_68 = Asignacion(int_info,aula_08,2, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_69 = Asignacion(calc_1,aula_08,2, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_70 = Asignacion(aga1,aula_08,3, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_71 = Asignacion(int_trans,aula_08,3, LocalTime.parse("18:00"),LocalTime.parse("22:00"))
val asignacion_72 = Asignacion(calc_2,aula_08,4, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_73 = Asignacion(srg,aula_08,4, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_74 = Asignacion(aga2,aula_08,5, LocalTime.parse("08:00"),LocalTime.parse("12:00"))
val asignacion_75 = Asignacion(calc_avan,aula_08,5, LocalTime.parse("12:00"),LocalTime.parse("18:00"))
val asignacion_76 = Asignacion(sis_trans,aula_08,5, LocalTime.parse("18:00"),LocalTime.parse("22:00"))

val listaAsignacion = listOf(asignacion_01,asignacion_02,asignacion_03,asignacion_04,asignacion_05,asignacion_06
    ,asignacion_07,asignacion_08,asignacion_09,asignacion_10,asignacion_11,asignacion_12,asignacion_13,asignacion_14
    ,asignacion_15,asignacion_16,asignacion_17,asignacion_18,asignacion_19,asignacion_20,asignacion_21,asignacion_22
    ,asignacion_23,asignacion_24,asignacion_25,asignacion_26,asignacion_27,asignacion_28,asignacion_29,asignacion_30
    ,asignacion_31,asignacion_32,asignacion_33,asignacion_34,asignacion_35,asignacion_36,asignacion_37,asignacion_38
    ,asignacion_39,asignacion_40,asignacion_41,asignacion_42,asignacion_43,asignacion_44,asignacion_45,asignacion_46,asignacion_47
    ,asignacion_48,asignacion_49,asignacion_50,asignacion_51,asignacion_52,asignacion_53,asignacion_54,asignacion_55
    ,asignacion_56,asignacion_57,asignacion_58,asignacion_59,asignacion_60,asignacion_61,asignacion_62,asignacion_63
    ,asignacion_64,asignacion_65,asignacion_66,asignacion_67,asignacion_68,asignacion_69,asignacion_70,asignacion_71
    ,asignacion_70,asignacion_72,asignacion_73,asignacion_74,asignacion_75,asignacion_76)

val listMateria = listOf(fisica_1,matematica_1,anatomia_fisiologia_1,introduccion_computacion,fisica_2,
    matematica_2,anatomia_fisiologia_2,leng_prog,phsi_1,fisica_3,teg_imagenes_1,enf_y_erg,proc_digital_img,
    prob_estads,radioproteccion,phsi_2,teg_imagenes_2,et_deon,teg_imagenes_3,radioquimica,phsi_3,final_DI,teg_imagenes_4
    ,phsi_4,comp_1,laMejorMateria,med_elec,taller_elec_1,biofisica,elec_ap_1,inst_elecmedica_1,taller_elec_2,
    radiof_radioprot,elec_ap_2,inst_elecmedica_2,taller_electromedicina_1,proc_adq_anl_seniales,elec_ap_3,inst_elecmedica_3
    ,taller_electromedicina_2,final_EM,labo_1,labo_2,spd,algo_1,mate_3,caso,algo_2,redes,met_num,algo_3,bd,seminario
    ,phm,proy_soft,parad_prog,red_info_1,proy_1,red_info_2,adm_rede_comp,proy_2,red_info_3,sac,proy_3,int_an_mate
    ,cts,quim_general,int_info,calc_1,aga1,int_trans,calc_2,srg,aga2,calc_avan,sis_trans,hsal,est_tec,materiales
    ,termodinamica,mec_fluid,erm,SITCT,elec_analg,trans_carr,trans_ferro,trans_mar,trans_aero,mcat,teg_veh,mov_urbana
    ,LGA,lrt,inv_op,seg_trans,log_inter,ing_trans,tepp,gept,pps,tema,final_it)

val admin = Usuario("Admin","Admin",Roles.ADMIN)
val asignador = Usuario("Asignador","Asignador",Roles.ASIGNADOR)

val listAsignacionAleatoria = asignacionAutomatica(listaAulas,listMateria)