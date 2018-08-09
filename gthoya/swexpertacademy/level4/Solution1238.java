package swexpertacademy.level4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contact> contactList;
        List<Contact> currentList = new ArrayList<>();
        List<Contact> nextList = new ArrayList<>();
        boolean[] isVisit;
        int inputCount, startPerson;
        int current, next, max;
        boolean isSameContact;

        for (int i = 1; i <= 10; i++) {
            contactList = new ArrayList<>();
            isVisit = new boolean[100];

            inputCount = scanner.nextInt() / 2;
            startPerson = scanner.nextInt();

            for (int j = 0; j < inputCount; j++) {
                isSameContact = false;

                current = scanner.nextInt();
                next = scanner.nextInt();

                for (int k = 0; k < contactList.size(); k++) {
                    if (contactList.get(k).current == current && contactList.get(k).next == next) {
                        isSameContact = true;
                        break;
                    }
                }

                if (!isSameContact) {
                    Contact contact = new Contact(current, next);
                    contactList.add(contact);

                    if (startPerson == contact.current) {
                        nextList.add(contact);
                        isVisit[current - 1] = true;
                    }
                }
            }

            while (nextList.size() > 0) {
                currentList = nextList;
                nextList = new ArrayList<>();

                Contact contact;
                for (int j = 0; j < currentList.size(); j++) {
                    contact = currentList.get(j);
                    if (!isVisit[contact.next - 1]) {
                        isVisit[contact.next - 1] = true;

                        for (int k = 0; k < contactList.size(); k++) {
                            if (contactList.get(k).current == contact.next && !isVisit[contactList.get(k).next - 1]) {
                                nextList.add(contactList.get(k));
                            }
                        }
                    }
                }
            }

            max = 0;
            for (int j = 0; j < currentList.size(); j++) {
                if (currentList.get(j).next > max) {
                    max = currentList.get(j).next;
                }
            }

            System.out.println("#" + i + " " + max);
        }
    }

    private static class Contact {
        public int current;
        public int next;

        public Contact() {}
        public Contact(int current, int next) {
            this.current = current;
            this.next = next;
        }
    }
}
