# SystemAnalytics

Проект разработки аналитической платформы. Цель проекта помочь системному аналитику
 выбрать наиболее оптимальный вариант проектирования системы, ее модулей, шаблоны интеграции.
 
а) В проекте параллельно разрабатывается собственный фреймворк тестирования/
б) Система Dependency injection реализована через паттерн фабрика, пример реализация Spring Java Config/

Основной язык платформы Scala/

Уже реализовано:
1. Свой фреймворк для тестирования
2. Конфигурация с внешнего файла DataConfig
3. ScalaDoc
4. Собственный Looger  с автоматической записью в фаил loggerFile двух видов событий: info, error - реализация на Java/

Непрограммным ЯДРОМ платформы является модуль SubjectModel - модуль предметной области, который содержит базовую информацию, формулы, методологии, справочную информацию. 
Это информация используется для сценариев обработки, сегментации и анализа любых типов данных.
Достаточно заменить предметную область, например медицинской, можно создавать предиктивные системы анализа и выявления болезни сердца или рака. 
Такой же подход используется при работе с интернет-маркетингом, различными каналами продаж, логистикой и т.д.
Прогностическая аналитика лучше подойдет для маломасштабных предположений и оценок. 
 


Планирую:
а) Вести Akka
б) API для веб интерфейса - реализация будет лежать на конечном пользователе
с) Расширить платформу инструментами для бизнес анализа
l) 150 параметров с бизнес/системного анализа

