package collectionpractise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	int id;
	String name;
	double cgpa;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;

	}

	public String toString() {
		return "ID:" + this.id + " " + "Name:" + this.name + " " + "cgpa:" + this.cgpa;
	}

	@Override
	public int compareTo(Student o) {

		return this.id - o.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}

}




public class CollectionsClass {

	public static void main(String[] args) {
		
		// ArrayList
		ArrayList<String> studentName = new ArrayList<String>();
		studentName.add("Bithi");
		studentName.add("Tithi");// add(value)
		studentName.add(1, "Shithi");// add(index,value)

		ArrayList<String> teacherName = new ArrayList<String>();
		teacherName.add("Minul");
		teacherName.add("Zinul");
		teacherName.set(0, "Mrinul");// set(index,value)
		teacherName.addAll(studentName);// addAll()
		System.out.println(teacherName.get(1)); // get(index)
		System.out.println(teacherName.indexOf("Zinul")); // indexOf(value)
		System.out.println(teacherName.contains("Mrinul")); // contains(value)
		studentName.remove(1);// remove(index)
		teacherName.clear(); // remove all
		System.out.println(teacherName);
		System.out.println(teacherName.equals(studentName));// compare two list

		// List
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(6);
		list.add(5);
		list.add(7);
		list.add(3, 10);
		System.out.println(list);
		list.set(1, 60);
		System.out.println(list);
		list.remove(2);
		System.out.println(list.contains(7));
		list.remove(Integer.valueOf(3)); // remove through value

		// iteration
		for (int i = 0; i < list.size(); i++) // size()
		{
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		Iterator<Integer> it = list.iterator(); // iterator
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println(list);
		list.clear();

		// stack
		Stack<Integer> num = new Stack<Integer>();
		num.push(10);
		num.push(30);
		num.push(20);
		num.push(40);
		num.push(50);
		num.push(20);
		System.out.println("Stack: " + num); // 10 30 20 40 50 20
		System.out.println("Stack: " + num.peek());// 20 top value
		num.pop();// 10 30 20 40 50
		System.out.println("Stack: " + num.peek());// 50

		// Queue
		Queue<Integer> num1 = new LinkedList<>();
		num1.offer(10);
		num1.offer(20);
		num1.offer(30);
		num1.offer(40);
		System.out.println(num1); // 10 20 30 40
		System.out.println(num1.peek());// 10
		num1.poll();
		System.out.println(num1);// 20 30 40
		System.out.println(num1.peek());// 20

		// Priority Queue (Min heap)
		Queue<Integer> num2 = new PriorityQueue<>();
		num2.offer(10);
		num2.offer(5);
		num2.offer(30);
		num2.offer(7);
		System.out.println(num2); // 5 7 30 10
		System.out.println(num2.peek());// 5
		num2.poll();
		System.out.println(num2);// 7 10 30
		System.out.println(num2.peek());// 7

		// Priority Queue (Max heap)
		Queue<Integer> num3 = new PriorityQueue<>(Comparator.reverseOrder());
		num3.offer(10);
		num3.offer(5);
		num3.offer(30);
		num3.offer(7);
		System.out.println(num3); // 30, 7, 10, 5
		System.out.println(num3.peek());// 30
		num3.poll();
		System.out.println(num3);// 10, 7, 5
		System.out.println(num3.peek());// 10

		// Dequeue
		ArrayDeque<Integer> num4 = new ArrayDeque<>();
		num4.offer(10);
		num4.offer(5);
		num4.offerFirst(15);
		num4.offerLast(6);
		System.out.println(num4);// [15, 10, 5, 6]
		System.out.println(num4.peek());// 15
		System.out.println(num4.peekFirst());// 15
		System.out.println(num4.peekLast());// 6
		num4.poll();
		System.out.println(num4);// [10, 5, 6]
		num4.pollFirst();
		System.out.println(num4);// [5, 6]
		num4.pollLast();
		System.out.println(num4);// [5]

		// HashSet
		Set<Integer> num5 = new HashSet<Integer>();
		num5.add(3);
		num5.add(2);
		num5.add(3);
		num5.add(6);
		num5.add(14);
		System.out.println(num5);// [2, 3, 6, 14]
		num5.remove(6);// remove(value)
		System.out.println(num5.contains(3));// true
		System.out.println(num5.isEmpty());// false
		System.out.println(num5.size());// 3

		// LinkedHashSet
		Set<Integer> num6 = new LinkedHashSet<Integer>();
		num6.add(3);
		num6.add(2);
		num6.add(3);
		num6.add(6);
		num6.add(14);
		System.out.println(num6);// [ 3, 2, 6, 14]
		num6.remove(6);// remove(value)
		System.out.println(num6.contains(3));// true
		System.out.println(num6.isEmpty());// false
		System.out.println(num6.size());// 3

		// TreeSet
		Set<Integer> num7 = new TreeSet<Integer>();
		num7.add(3);
		num7.add(2);
		num7.add(3);
		num7.add(6);
		num7.add(14);
		System.out.println(num7);// [2, 3, 6, 14]
		num7.remove(6);// remove(value)
		System.out.println(num7.contains(3));// true
		System.out.println(num7.isEmpty());// false
		System.out.println(num7.size());//

		// Hash Map
		Map<Integer, String> num8 = new HashMap<>();
		num8.put(1, "Bithi");
		num8.put(3, "Tithi");
		num8.put(4, "Sriti");
		System.out.println(num8);
		System.out.println(num8.isEmpty());
		System.out.println(num8.containsValue("Tithi"));

		// TreeMap
		Map<Integer, String> num9 = new TreeMap<>();
		num9.put(1, "Bithi");
		num9.put(38, "Tithi");
		num9.put(24, "Sriti");
		num9.put(63, "Miti");

		num9.remove(24);
		System.out.println(num9.get(38));// true
		System.out.println(num9);// {1=Bithi, 38=Tithi, 63=Miti}
		System.out.println(num9.containsValue("Tithi"));

		// Arrays Class
		int arr[] = { 1, 2, 3, 4, 5, 7, 9 };
		int findLoc = Arrays.binarySearch(arr, 5);// binary search
		if (findLoc > 0) {
			System.out.println("Found at location : " + findLoc);
		} else {
			System.out.println("Not Found");
		}

		System.out.println("Size of Array: " + arr.length);
		int arr1[] = { 4, 9, 2, 0, 2, 7 };
		Arrays.sort(arr1); // sorting
		System.out.println("Array: " + Arrays.toString(arr1));
		Arrays.fill(arr1, 12);
		for (int i : arr1) {
			System.out.printf("%d \n", i);
		}

		// Collections
		List<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(4);
		arr2.add(76);
		arr2.add(5);
		arr2.add(87);
		arr2.add(4);

		System.out.println("ArrayList: " + arr2);// ArrayList: [4, 76, 5, 87, 4]
		System.out.println("Size of ArrayList: " + arr2.size());// 5
		Collections.sort(arr2);
		System.out.println("Ascending: " + arr2);// [4, 4, 5, 76, 87]

		System.out.println(Collections.min(arr2));// 4
		System.out.println(Collections.max(arr2));// 87
		System.out.println(Collections.binarySearch(arr2, 76));// 3
		System.out.println(Collections.frequency(arr2, 4));// 2

		Collections.sort(arr2, Comparator.reverseOrder());
		System.out.println("Descending: " + arr2);// [87, 76, 5, 4, 4]

		
		
		
		
		// OOP with Collections
		LinkedList<Student> studentList = new LinkedList<Student>();
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		double cgpa;

		for (int i = 1; i <= 3; i++) {
			System.out.println("ENter ID :");
			id = sc.nextInt();
			System.out.println("ENter Name :");
			name = sc.next();
			System.out.println("ENter CGPA :");
			cgpa = sc.nextDouble();

			Student student = new Student(id, name, cgpa);
			studentList.add(student); // added to the List
		}

		for (Student i : studentList) {
			System.out.println(i.toString());
		}

		Collections.sort(studentList);

		System.out.println("Sorted List: ");

		for (Student i : studentList) {
			System.out.println(i.toString());
		}

		
		
	}

}
