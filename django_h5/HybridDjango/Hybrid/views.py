#coding:utf-8
from django.shortcuts import render
from django.http import HttpResponse,HttpResponseRedirect
from django.template.loader import render_to_string
import os
# Create your views here.
def hybrid(request):
    # context = {'some_key': 'some_value'}
    # static_html = './path/to/static.html'
    # if not os.path.exists(static_html):
    #     content = render_to_string('Hybrid/hybrid.html', context)
    #     with open(static_html, 'w') as static_file:
    #         static_file.write(content)
    return render(request, 'Hybrid/hybrid.html')
def custom(request):
    return render(request,'Hybrid/custom_hybrid.html')
