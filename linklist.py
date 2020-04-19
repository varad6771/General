class Node(object):
	def __init__(self, data=None, next_node=None):
		self.data = data
		self.next_node = next_node

class Single_linked_list(object):
	def __init__(self):
		self.head=None

	def inset_at_beg(self, data):
		self.head = Node(data=data, next_node=self.head)
	
	def insert_at_end(self, data):
		if not self.head:
			self.head = Node(data=data)
			return
		curr = self.head
		while curr.next_node:
			curr = curr.next_node
		curr.next_node = Node(data=data)		
	
	def list_print(self):
		temp = self.head
		while temp is not None:
		    print (temp.data)
		    temp = temp.next_node

lst = Single_linked_list()

lst.inset_at_beg(23)
lst.insert_at_end(24)
lst.insert_at_end(25)
lst.insert_at_end(26)
lst.insert_at_end(27)
lst.insert_at_end(28)

lst.list_print()