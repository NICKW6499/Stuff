����   4 �  project/Knowledge  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lproject/Knowledge; perimeterArea  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;  Length: 
 ! # " java/io/PrintStream $ % println (Ljava/lang/String;)V
  ' ( ) nextInt ()I + Width: @        / java/lang/StringBuilder
 1 3 2 java/lang/String 4 5 valueOf (I)Ljava/lang/String;
 . 7  % 9 * is the total perimeter and total area is 
 . ; < = append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 . ? < @ (D)Ljava/lang/StringBuilder;
 . B C D toString ()Ljava/lang/String;
  F G  close I PI is3.141592653589793 K Is Y between 0 and 100?
 ! M $ N (Z)V P Y is greater than 100 R Y is less than 0 T +Is y greater than 10 and less than 15? yes! V Y + Z = 
 . X < Y (I)Ljava/lang/StringBuilder; [ Y - Z =  ] Y * Z =  _ Y % Z =  a 
++Y + Z =  c 
--Y - Z =  e 	Y += 5 =  
scanLength Ljava/util/Scanner; length I 	scanWidth width area D totalPerimeter y z a StackMapTable dice u Roll the dice! w java/util/Random
 v 	
 v z ( { (I)I } Single dice roll is  roll Ljava/util/Random; n (II)I � Double dice roll is  m 
SourceFile Knowledge.java !               /     *� �    
                    	      �  
  �� Y� � K� �  *� &<� Y� � M� *�  ,� &>h�9 ,�k ,�kc�6� � .Y� 0� 68� :� >� A�  *� E,� E� H�  <66F� �� �6	� J�  
� d� � � L� d� � O�  � � Q�  � S�  �
� 
��� � .YU� 6`� W� A�  � � .YZ� 6d� W� A�  � � .Y\� 6h� W� A�  � � .Y^� 6p� W� A�  � � .Y`� 6�`� W� A�  � � .Yb� 6��d� W� A�  � � .Yd� 6�� W� A�  �    
   � !          #  +  0  6  F  e  i  m  u  y  }  �   � ! � " � # � $ � & � ) � * � , � ( � -  . /4 0N 1k 2� 3� 5    \ 	 � f g   � h i  #� j g  0s k i  6m l m  F] n i  y* o i  }& p i  � q i 	 r    � �     D� ! 	 s )     u     1� t�  � vY� xK*� y`<� � .Y|� 6� W� A�  �    
       7  8  :  ; / <       ! ~      � i  	 s �     �     <� t�  � vY� xM,� y`;,� y`<� � .Y�� 6`� W� A�  �    
       @  A  C  D " E : F         < � i     < � i   , ~    �    �