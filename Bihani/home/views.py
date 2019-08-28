from django.shortcuts import render,get_object_or_404,redirect
from django.http import HttpResponse, HttpResponseRedirect
import os


def home(request):
    template_name="index.html"
    return render(request,template_name)