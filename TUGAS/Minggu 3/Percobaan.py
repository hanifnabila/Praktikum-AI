from sys import exit

graph = {
  '40' : ['10','20'],
  '10' : ['30'],
  '20' : ['10', '30', '50', '60'],
  '30' : ['60'],
  '50' : ['70'],
  '60' : ['70'],
  '70' : []
}

visited = [] # List for visited nodes.
queue = []     #Initialize a queue

def bfs(visited, graph, node): #function for BFS
  visited.append(node)
  queue.append(node)

  while queue:          # Creating loop to visit each node
    m = queue.pop(0)
    print (m, end = " ")

    for neighbour in graph[m]:
      if neighbour not in visited:
        visited.append(neighbour)
        queue.append(neighbour)

# Driver Code
print("Following is the Breadth-First Search")
bfs(visited, graph, '40')    # function calling