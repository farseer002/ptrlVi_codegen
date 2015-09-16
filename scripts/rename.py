#-*- coding:utf-8 -*-
import os,sys

def main():
    debug = False
    aimDirName = ['drawable-hdpi','drawable-mdpi','drawable-xhdpi','drawable-xxhdpi','drawable-xxxhdpi']
    mp = {}
    reNameSecondPart = ''
    mode = 2
    if len(sys.argv) >= 2:
        print 'argument error: python rename.py <no argument>'
        exit()


    for i in aimDirName:
        rootdir = ".\\" + i
        
        # print rootdir
        for parent,dirnames,filenames in os.walk(rootdir):
            # for dirname in  dirnames:
                # print "parent is:" + parent
                # print  "dirname is" + dirname

            for filename in filenames:
                # print "parent is:" + parent
                # print "filename is:" + filename
                # print "the full name of the file is:" + os.path.join(parent,filename) 
               
                if mp.has_key(filename) == False:
                    s_tmp = raw_input("please enter the new name of: '" + filename + "':")
                    s_tmp = s_tmp.strip()
                    if s_tmp == '':
                        print 'has not changed the file name'
                        mp[filename] = filename
                    else:
                        mp[filename] = s_tmp
                    # print mp[filename]

                # s = 'ren ' + os.path.join(parent,mp[filename]) + ' ' + reName + str(num) + reNameSecondPart
                if mp[filename] != filename:
                    s = 'ren ' + os.path.join(parent,filename) + ' ' + mp[filename]
                else:
                    s = None
                if not debug: 
                    if s != None:
                        os.system(s)
                        print s


            
if __name__ == '__main__':
    reload(sys)
    sys.setdefaultencoding('utf8')
    main()
