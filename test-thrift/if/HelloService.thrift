namespace java com.xxzzycq.thrift.api

service HelloService {
  i32 sayInt(1:i32 param)
  string sayString(1:string param)
  bool sayBool(1:bool param)
  void sayVoid()
}