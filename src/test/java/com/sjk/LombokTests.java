package com.sjk;

import com.sjk.domain.Board;
import com.sjk.domain.Member;
import com.sjk.domain.Student;
import com.sjk.domain.UserItem;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LombokTests {

    /*@Test
    public void testNoArgsConstructor(){
        Board board = new Board();

        System.out.println(board);
    }*/

    /*@Test
    public void testRequiredArgsContructor(){
        Board board = new Board("테스트 제목");

        System.out.println(board);
    }*/

 /*   @Test
    public void testGetter(){
        Board board = new Board();

        System.out.println(board.getTitle());
    }

    @Test
    public void testSetter(){
        Board board = new Board();
        board.setTitle("게시판 제목");

        System.out.println(board.getTitle());
    }*/

  /*  @Test
    public void testToString(){
        Board board = new Board();

        System.out.println(board);
    }

    @Test
    public void testToStringExclude(){
        Member member = new Member();

        System.out.println(member);
    }*/

   /* @Test
    public void testBoard(){
        Board board1 = new Board();
        board1.setBoardNo(1);
        board1.setTitle("title1");

        Board board2 = new Board();
        board2.setBoardNo(2);
        board2.setTitle("title2");

        Board board3 = new Board();
        board3.setBoardNo(2);
        board3.setTitle("title3");

        Set<Board> boardSet = new HashSet<>();

        boardSet.add(board1);
        boardSet.add(board2);
        boardSet.add(board3);

        System.out.println("저장된 데이터 수 : " + boardSet.size());

        Iterator<Board> it = boardSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }*/

    /*@Test
    public void testUserItem(){
        UserItem userItem1 = new UserItem();
        userItem1.setUserNo(1);
        userItem1.setItemId(100);
        userItem1.setDescription("userItem1");

        UserItem userItem2 = new UserItem();
        userItem2.setUserNo(1);
        userItem2.setItemId(200);
        userItem2.setDescription("userItem2");

        UserItem userItem3 = new UserItem();
        userItem3.setUserNo(1);
        userItem3.setItemId(200);
        userItem3.setDescription("userItem3");

        Set<UserItem> userItemSet = new HashSet<>();

        userItemSet.add(userItem1);
        userItemSet.add(userItem2);
        userItemSet.add(userItem3);

        System.out.println("저장된 데이터 수 : " + userItemSet.size());

        Iterator<UserItem> it = userItemSet.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }*/

    @Test
    public void testStudent(){
        Student student1 = new Student();
        student1.setStudentNo(1);
        student1.setName("Alex");

        Student student2 = new Student();
        student2.setStudentNo(2);
        student2.setName("Alex");

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(student1);
        studentSet.add(student2);

        System.out.println("저장된 데이터 수 : " + studentSet.size());
        Iterator<Student> it = studentSet.iterator();

        while(it.hasNext()){
            System.out.println(it.next());

        }

    }
}
