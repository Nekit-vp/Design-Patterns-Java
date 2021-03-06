шаблон проектирования — MVC (model-view-controller, по-русски модель-представление-контроллер, или прям так как и на английском модель-вью-контроллер).

Его суть в том, чтобы отделять бизнес-логику от представления. То есть, отделять код, который определяет, что делать от кода, который определяет, как отображать. View (представление или просто вьюхи) отвечает за то, в каком виде представлять какие-то данные. В нашем случае вьюхи — это наши jsp-странички. Именно поэтому я их и положил в папочку с названием views.

Модель — это собственно сами данные, с которыми работает программа. В нашем случае это пользователи (список пользователей). Ну а контроллеры — связующее звено между ними. Берут данные из модели и передают их во вьюхи (или получают от Tomcat какие-то данные, обрабатывают их и передают модели). Бизнес-логику (что именно программа должна делать) нужно описывать в них, а не в модели или во вьюхе. Таким образом, каждый занимается своим делом:

модель хранит данные;
вьюхи рисуют красивое представление данных;
контроллеры занимаются обработкой данных.

Это позволяет программе быть достаточно простой и поддерживаемой, а не монструозной свалкой всего кода в одном классе.

MVC подходит не только для веб-программирования, но именно в этой сфере он встречается особенно часто (едва ли не всегда).

В нашем случае в качестве контроллеров будут выступать сервлеты.