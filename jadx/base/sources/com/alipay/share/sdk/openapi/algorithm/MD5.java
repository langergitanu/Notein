package com.alipay.share.sdk.openapi.algorithm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/algorithm/MD5.class */
public class MD5 {
    public static String getMessageDigest(byte[] bytes) {
        char[] var1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] bytes2 = messageDigest.digest();
            int var8 = bytes2.length;
            char[] var3 = new char[var8 * 2];
            int var4 = 0;
            for (byte var6 : bytes2) {
                int i = var4;
                int var42 = var4 + 1;
                var3[i] = var1[(var6 >>> 4) & 15];
                var4 = var42 + 1;
                var3[var42] = var1[var6 & 15];
            }
            return new String(var3);
        } catch (Exception e) {
            return "";
        }
    }

    public static byte[] getRawDigest(byte[] bytes) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            return messageDigest.digest();
        } catch (Exception e) {
            return null;
        }
    }

    public static String getMD5(FileInputStream fileInputStream, int var1, int var2, int var3) {
        if (fileInputStream != null && var1 > 0 && var2 >= 0 && var3 > 0) {
            try {
                if (fileInputStream.skip(var2) < var2) {
                    return null;
                }
                MessageDigest var10 = MessageDigest.getInstance("MD5");
                StringBuilder var4 = new StringBuilder(32);
                byte[] var9 = new byte[var1];
                int var6 = 0;
                while (true) {
                    int var11 = fileInputStream.read(var9);
                    if (var11 == -1 || var6 >= var3) {
                        break;
                    }
                    if (var6 + var11 <= var3) {
                        var10.update(var9, 0, var11);
                        var6 += var11;
                    } else {
                        var10.update(var9, 0, var3 - var6);
                        var6 = var3;
                    }
                }
                byte[] var8 = var10.digest();
                for (byte b : var8) {
                    var4.append(Integer.toString((b & 255) + 256, 16).substring(1));
                }
                return var4.toString();
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public static String getMD5(FileInputStream fileInputStream, int var1) {
        if (fileInputStream != null && var1 > 0) {
            try {
                MessageDigest var2 = MessageDigest.getInstance("MD5");
                StringBuilder var3 = new StringBuilder(32);
                byte[] var7 = new byte[var1];
                while (true) {
                    int var8 = fileInputStream.read(var7);
                    if (var8 == -1) {
                        break;
                    }
                    var2.update(var7, 0, var8);
                }
                byte[] var6 = var2.digest();
                for (byte b : var6) {
                    var3.append(Integer.toString((b & 255) + 256, 16).substring(1));
                }
                return var3.toString();
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public static String getMD5(String var0) {
        if (var0 == null) {
            return null;
        }
        File var1 = new File(var0);
        if (var1.exists()) {
            return getMD5(var1, 102400);
        }
        return null;
    }

    public static String getMD5(File file) {
        return getMD5(file, 102400);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getMD5(File file, int var1) {
        if (file == null || var1 <= 0 || !file.exists()) {
            return null;
        }
        FileInputStream var2 = null;
        boolean var8 = false;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            var2 = fileInputStream;
            String var14 = getMD5(fileInputStream, (int) (((long) var1) <= file.length() ? var1 : file.length()));
            var2.close();
            var8 = false;
            if (0 != 0) {
                if (var2 != null) {
                    try {
                        var2.close();
                    } catch (IOException e) {
                    }
                }
            }
            try {
                var2.close();
            } catch (IOException e2) {
            }
            return var14;
        } catch (Exception e3) {
            if (0 != 0) {
                if (var2 != null) {
                    try {
                        var2.close();
                    } catch (IOException e4) {
                        if (var2 != null) {
                            try {
                                var2.close();
                            } catch (IOException e5) {
                                return null;
                            }
                        }
                        return null;
                    }
                }
            }
            if (var2 != null) {
            }
            return null;
        } catch (Throwable th) {
            if (var8) {
                if (var2 != null) {
                    try {
                        var2.close();
                    } catch (IOException e6) {
                        throw th;
                    }
                }
            }
            throw th;
        }
    }

    public static String getMD5(String var0, int var1, int var2) {
        if (var0 == null) {
            return null;
        }
        File var3 = new File(var0);
        if (var3.exists()) {
            return getMD5(var3, var1, var2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getMD5(File file, int var1, int var2) {
        if (file == null || !file.exists() || var1 < 0 || var2 <= 0) {
            return null;
        }
        FileInputStream var3 = null;
        boolean var9 = false;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            var3 = fileInputStream;
            String var15 = getMD5(fileInputStream, 102400, var1, var2);
            var3.close();
            var9 = false;
            if (0 != 0) {
                if (var3 != null) {
                    try {
                        var3.close();
                    } catch (IOException e) {
                    }
                }
            }
            try {
                var3.close();
            } catch (IOException e2) {
            }
            return var15;
        } catch (Exception e3) {
            if (0 != 0) {
                if (var3 != null) {
                    try {
                        var3.close();
                    } catch (IOException e4) {
                        if (var3 != null) {
                            try {
                                var3.close();
                            } catch (IOException e5) {
                                return null;
                            }
                        }
                        return null;
                    }
                }
            }
            if (var3 != null) {
            }
            return null;
        } catch (Throwable th) {
            if (var9) {
                if (var3 != null) {
                    try {
                        var3.close();
                    } catch (IOException e6) {
                        throw th;
                    }
                }
            }
            throw th;
        }
    }
}
