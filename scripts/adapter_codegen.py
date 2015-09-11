#-*- coding:utf-8 -*-
import os,sys
debug = False
def main():
    

    if len(sys.argv) < 2:
        print 'error'
        exit()
    template_class_name = sys.argv[1]
    content = ''

    template_file_name = 'template_adapter.java'
    replace_file_name = template_class_name+'Adapter.java'
    replace_dict = {'#Template_Class#':template_class_name}

    ret = replaceTemplateFile(template_file_name,replace_file_name,replace_dict)

    if not ret:
        exit()

    template_file_name = 'template_adapter_in_main.java'
    replace_file_name = template_class_name + 'Adapter_in_main.java'
    template_class_name_lower = (template_class_name[0:1]).lower() + template_class_name[1:]
    replace_dict = {'#Template_Class#':template_class_name,'#Template_Class_Lower#':template_class_name_lower}

    replaceTemplateFile(template_file_name,replace_file_name,replace_dict)


def replaceTemplateFile(template_file_name,replace_file_name,replace_dict):
    global debug
    content = None
    with open(template_file_name) as f:
        content = f.read()
        for template_word,replace_word in replace_dict.iteritems():
            content = content.replace(template_word,replace_word)
    if content == None:
        print 'read error'
        return False

    with open(replace_file_name,'w') as f:
        if(not debug):
            f.write(content)
        else:
            print content

    return True


if __name__ == '__main__':
    reload(sys)
    sys.setdefaultencoding('utf8')
    main()