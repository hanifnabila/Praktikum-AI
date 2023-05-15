graph = {
    '0': ['3', '4'],
    '1': ['0', '6'],
    '2': ['5', '4'],
    '3': ['1', '7'],
    '4': ['6'],
    '5': ['6', '7'],
    '6': ['2','4'],
    '7': ['5']
}

visited = set()

def dfs(visited, graph, node):
    if node not in visited:
        print(node)
        visited.add(node)
        for neighbour in graph[node]:
            dfs(visited, graph, neighbour)

print("Following is the Depth-First Search")
dfs(visited, graph, '0')
