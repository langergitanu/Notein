package o0oo000O;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;

/* JADX INFO: renamed from: o0oo000O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31186OooO0Oo {
    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:69|5)|(4:80|6|78|7)|(5:8|(1:10)(1:82)|25|52|4)|15|65|16|76|20) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:69|5|(4:80|6|78|7)|(5:8|(1:10)(1:82)|25|52|4)|15|65|16|76|20) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String OooO00o(File file) throws Throwable {
        ?? r0;
        BufferedInputStream bufferedInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        byte[] byteArray;
        boolean zOooOOo = C31190OooO0oo.OooOOo(file);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (zOooOOo) {
            try {
                try {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 4194304);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                th = th;
                r0 = zOooOOo;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bArr = new byte[4194304];
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    byteArray = null;
                    if (byteArray == null) {
                    }
                }
            } catch (IOException e5) {
                e = e5;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                r0 = bufferedInputStream;
                try {
                    r0.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                if (0 == 0) {
                    throw th;
                }
                try {
                    byteArrayOutputStream2.close();
                    throw th;
                } catch (IOException e7) {
                    e7.printStackTrace();
                    throw th;
                }
                byteArray = null;
                if (byteArray == null) {
                }
            }
            while (true) {
                int i = bufferedInputStream.read(bArr, 0, 4194304);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
                e.printStackTrace();
                byteArray = null;
            }
            byteArray = byteArrayOutputStream.toByteArray();
            bufferedInputStream.close();
            byteArrayOutputStream.close();
        } else {
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        if (OooOOOO.OooO0O0(null)) {
            return new String(byteArray);
        }
        try {
            return new String(byteArray, (String) null);
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static void OooO0O0(String str, byte[] bArr) {
        File fileOooOOO0 = C31190OooO0oo.OooOOO0(str);
        if (bArr == null) {
            Log.e("FileIOUtils", "bytes is null.");
            return;
        }
        if (!C31190OooO0oo.OooO0oO(fileOooOOO0)) {
            Log.e("FileIOUtils", "create file <" + fileOooOOO0 + "> failed.");
            return;
        }
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            try {
                try {
                    FileChannel channel = new FileOutputStream(fileOooOOO0, false).getChannel();
                    if (channel != null) {
                        channel.position(channel.size());
                        channel.write(ByteBuffer.wrap(bArr));
                        channel.close();
                    } else {
                        Log.e("FileIOUtils", "fc is null.");
                        if (channel != null) {
                            channel.close();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    if (0 != 0) {
                        abstractInterruptibleChannel.close();
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        abstractInterruptibleChannel.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public static boolean OooO0OO(File file, InputStream inputStream) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        if (inputStream == null || !C31190OooO0oo.OooO0oO(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, false), 4194304);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            byte[] bArr = new byte[4194304];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    bufferedOutputStream.write(bArr, 0, i);
                } else {
                    try {
                        break;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            inputStream.close();
            try {
                bufferedOutputStream.close();
                return true;
            } catch (IOException e3) {
                e3.printStackTrace();
                return true;
            }
        } catch (IOException e4) {
            e = e4;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            try {
                inputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            try {
                inputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            if (bufferedOutputStream2 == null) {
                throw th;
            }
            try {
                bufferedOutputStream2.close();
                throw th;
            } catch (IOException e8) {
                e8.printStackTrace();
                throw th;
            }
        }
    }

    public static boolean OooO0Oo(File file, String str) throws Throwable {
        BufferedWriter bufferedWriter;
        if (file == null || str == null) {
            return false;
        }
        if (!C31190OooO0oo.OooO0oO(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(file, false));
                } catch (IOException e) {
                    e.printStackTrace();
                    return false;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            bufferedWriter.close();
            return true;
        } catch (IOException e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                bufferedWriter2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }
}
