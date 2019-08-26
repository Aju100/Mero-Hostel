from django.shortcuts import render
from django.http import HttpResponse, HttpResponseRedirect

def home(request):
    return render(request,'index.html')