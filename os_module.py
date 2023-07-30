import os

print(os.getcwd())
os.chdir("..")
print(os.getcwd())
# os.system("dir")
os.chdir("CSF Training")
print(os.getcwd())
print(os.path.exists("os_module.py"))
print(os.path.isdir("os_module.py"))
print(os.path.isfile("os_module.py"))

# print(os.environ)

