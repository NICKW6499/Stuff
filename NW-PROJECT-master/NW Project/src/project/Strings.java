����   4 Y  project/Strings  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lproject/Strings; stringStuff ()Ljava/lang/String;	    java/lang/System   out Ljava/io/PrintStream;  uArray: My program is frustrating because it takes a super long 
 time to figure out how to get everything working! :D
    java/io/PrintStream   println (Ljava/lang/String;)V  nMy program is frustrating because it takes a super long 
 time to figure out how to get everything working! :D ! java/lang/StringBuilder
 # % $ java/lang/String & ' length ()I
 # ) * + valueOf (I)Ljava/lang/String;
   -   /  is the length of the string.
   1 2 3 append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
   5 6  toString
 # 8 9 : equalsIgnoreCase (Ljava/lang/String;)Z
  <  = (Z)V
 # ? @ A charAt (I)C
 # C * D (C)Ljava/lang/String; F . is the character in the 4th spot in the array H java/lang/Integer
 G J  K (I)V
 G M N O 	compareTo (Ljava/lang/Integer;)I
  Q  K x Ljava/lang/String; T Ljava/lang/Integer; Y 
SourceFile Strings.java !               /     *� �    
                    	       �     t� � K� �  Y� "� (� ,.� 0� 4� � � 7� ;� �  Y� >� B� ,E� 0� 4� � GY(� IL� GY(� IM� ,+� L� P�    
   & 	     	   (  5  S  ]  g  r         i R S   ]  T U  g  V U   W    X