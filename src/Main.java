public class Main {
    public static class List {
        private Node Head;

        private class Node {
            private int value;
            private Node next;
        }

        /**
         * Добавление в односвязный список
         */
        void push(int value) {
            Node node = new Node();
            node.value = value;
            node.next = Head;
            Head = node;
        }

        /**
         * Извлечение из односвязного списка
         */
        Integer pop() {
            if (Head != null) {
                Integer value = Head.value;
                Head = Head.next;
                return value;
            }
            return null;
        }

        void print() {
            Node current = Head;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }
        }

        /**
         * Добавление в конец односвязного списка
         */
        void pushBack(int value) {
            Node node = new Node();
            node.value = value;

            Node current = Head;
            if (current != null) {
                while (current.next != null) {
                    current = current.next;
                }
                current.next = node;
            } else {
                Head = node;
            }
        }

        /**
         * Поиск элемента
         * Находит первый искомый элемент в односвязном списке
         */
        Node find(int value) {
            Node current = Head;
            while (current != null) {
                if (current.value == value) {
                    return current;
                }
                current = current.next;
            }
            return null;
        }
    }

    /**
     * Двусвязный список
     */
    public static class dList {
        private Node Head;
        private Node Tail;

        private class Node {
            private int value;
            private Node next;
            private Node prev;
        }

        /**
         * Добавление в начало двусвязного списка
         */
        void pushFront(int value) {
            Node node = new Node();
            node.value = value;

            if (Head != null) {
                Head.prev = node;
                node.next = Head;
            } else {
                Tail = node;
            }

            Head = node;
        }

        /**
         * Извлечение из двусвязного списка начального элемента
         */
        Integer popFront() {
            if (Head != null) {
                Integer value = Head.value;
                if (Head.next != null) {
                    Head = Head.next;
                    Head.prev = null;
                } else {
                    Head = null;
                    Tail = null;
                }
                return value;
            }
            return null;
        }

        void print() {
            Node current = Head;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }
        }

        /**
         * Добавление в конец двусвязного списка
         */
        void pushBack(int value) {
            Node node = new Node();
            node.value = value;

            if (Tail != null) {
                Tail.next = node;
                node.prev = Tail;
            } else {
                Head = node;
            }

            Tail = node;
        }

        /**
         * Поиск элемента
         * Находит первый искомый элемент в двусвязном списке
         */
        Node find(int value) {
            Node current = Head;
            while (current != null) {
                if (current.value == value) {
                    return current;
                }
                current = current.next;
            }
            return null;
        }

        /**
         * Поиск элемента
         * Находит последний искомый элемент в двусвязном списке
         */
        Node revFind(int value) {
            Node current = Tail;
            while (current != null) {
                if (current.value == value) {
                    return current;
                }
                current = current.prev;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        dList list = new dList();

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);

        list.print();

        System.out.println(list.popFront());

        list.print();
    }
}
