����   4 �  project/myArray  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lproject/myArray; array  java/lang/Integer
     valueOf (I)Ljava/lang/Integer;	    java/lang/System   out Ljava/io/PrintStream;  "One-dimensional array: 1 2 3 4 5 6
     java/io/PrintStream ! " println (Ljava/lang/String;)V $ java/lang/StringBuilder & Index of 4:
 # (  "
 * , + java/util/Arrays - . asList %([Ljava/lang/Object;)Ljava/util/List; 0 2 1 java/util/List 3 4 indexOf (Ljava/lang/Object;)I
 # 6 7 8 append (I)Ljava/lang/StringBuilder;
 # : ; < toString ()Ljava/lang/String; > Largest Number is :  @ Smallest Number is :  B The sum of the array is 
  D !  F Two dimensional array: H [I
 J L K java/lang/String  M (I)Ljava/lang/String; O  
 # Q 7 R -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  T U " print
  W ! X (I)V Z (The number 4 is located at coordinates ( \ , ^ )
 ` java/util/ArrayList
 _ 	 c Steve
 _ e f g add (Ljava/lang/Object;)Z i Tim k Lucy m Pat o Angela q Tom
  s ! t (Ljava/lang/Object;)V
 _ v f w (ILjava/lang/Object;)V array1 [Ljava/lang/Integer; smallest I largest i1 sum i twoArray [[I indexN indexW num N W alist Ljava/util/ArrayList; element Ljava/lang/Integer; LocalVariableTypeTable )Ljava/util/ArrayList<Ljava/lang/String;>; StackMapTable y � 
SourceFile myArray.java !               /     *� �    
                    	      e    u�
YOYOY?OYDOYOY8OYaOK� Y� SY� SY� SY� SY� SY� SL� � � � #Y%� '+� )� � / � 5� 9� *.=*.>6� #*.� *.>� *.� *.=�*���ܲ � #Y=� '� 5� 9� � � #Y?� '� 5� 9� 66� *.`6���� � #YA� '� 5� 9� � � C� E� � GY�
YOYOYOYOYOSY�
YOYOYOY	OY
OS:6666	� Z6
� E	2
.� 	2
.6	6
6� � #Y	2
.� I� 'N� P� 9� S�

���� � C�		���� � V� � #YY� '� 5[� P� 5]� P� 9� S� _Y� a:		b� dW	h� dW	j� dW	l� dW	n� dW	p� dW� 	� r	b� u� 	� r+Y:�66� 2:
� 
� r����    
   � 3    '  X  `  �  �  �  �  �  �  �  �  �  �  � ! � " � & � " � ( ) *$ +c ,f -i .l 0r 1x 3� 4� 5� 6� 8� 1� :� 0� <� =� > ? @ A B& C. D6 G> JF MN Nb Pj Nt R    �  'N x H   X  y  �� z {  �� | {  � * } {  �� ~ {  �   { c � � f � { i � { l	 � { o ` � { 	u K � { 
 o � � 	b  � � 
 �     o � � 	 �   Z � �  G �  � ;� y 
 G � �  � "� � �  G � � _  �    �    �