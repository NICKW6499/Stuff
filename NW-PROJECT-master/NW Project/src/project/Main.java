����   4 �  project/Main  project/Knowledge <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lproject/Main; main ([Ljava/lang/String;)V 
Exceptions  java/lang/Exception  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     ! out Ljava/io/PrintStream; # cWelcome to the test program. If you would like to 
 get back to the main menu, restart the program.
 % ' & java/io/PrintStream ( ) println (Ljava/lang/String;)V + Enter number: - 1. Math shtuff / 
2. Car age 1 3. String stuff 3 4. Dice 5 5. Car 7 6. Loops 9 7. Array ; #8. Super and subclasses inheritance = 9. Polymorphism
  ? @ A nextInt ()I
  C D  perimeterArea
 F H G project/Strings I J stringStuff ()Ljava/lang/String;
  L M A dice O project/Car Q black S 
Kia Optima
 N U  V ((Ljava/lang/String;Ljava/lang/String;I)V X java/lang/StringBuilder Z My car is a 
 W \  )
 ^ ` _ java/lang/Object a J toString
 W c d e append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 W ` h year of your car: j Enter model of car:
  l m J nextLine o Enter make of car: q Your car is  s 
 years old
 u w v project/Loops x  loop
 z | { project/myArray }  array
  � � project/Subclass �  Supersub
 � � � project/Food �  eat � Invalid Selection
  � �  close � Please only enter a number �  java/util/InputMismatchException args [Ljava/lang/String; 	selection I scan Ljava/util/Scanner; myCar Lproject/Car; year model Ljava/lang/String; make yourCar ex "Ljava/util/InputMismatchException; StackMapTable � 
SourceFile 	Main.java !               /     *� �    
       
             	            �    d� Y� � M� "� $� *� $� ,� $� .� $� 0� $� 2� $� 4� $� 6� $� 8� $� :� $� <� $,� ><�     �      	   3   �   9   @   G   �   �   �   ܸ B� ĸ EW� �� KW� �� NYPR۷ TN� � WYY� [-� ]� b� f� $� g� $,� >6� i� $,� k:� n� $,� k:� NY� T:� � WYp� [� ]� br� b� f� $� 3� t� -� y� '� ~� !� �� � �� $,� �� N� �� $�  cWZ �  
   � -          #  +  3  ;  C  K  S  [  c  h  �  �   � " � # � % � & � ( � ) � + � , � . � / � 1 � 2 4 50 73 96 :9 << =? ?B @E BH CK ES FW HZ I[ Jc L    \ 	  d � �   h � � �  Y � �  � t � �  � M � �  � ? � �  1 � �  " � � [  � �  �   % � � � ��   �    �  �    �