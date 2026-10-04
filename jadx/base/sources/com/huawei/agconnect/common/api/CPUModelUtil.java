package com.huawei.agconnect.common.api;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes8.dex */
public class CPUModelUtil {
    private static final String FILE_KEY = "Hardware";
    private static final String FILE_PATH = "/proc/cpuinfo";
    private static final String SPLIT_KEY = ":";
    private static final String TAG = "CPUModelUtil";

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        r4.close();
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getCpuModel() throws Throwable {
        StringBuilder sb;
        BufferedReader bufferedReader = null;
        BufferedReader bufferedReader2 = null;
        BufferedReader bufferedReader3 = null;
        try {
            try {
                BufferedReader bufferedReader4 = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH), "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader4.readLine();
                        if (line == null) {
                            try {
                                break;
                            } catch (IOException e) {
                                e = e;
                                sb = new StringBuilder("close cpuinfo io error :");
                                sb.append(e.getMessage());
                                Logger.m75327e(TAG, sb.toString());
                                return "";
                            }
                        }
                        if (line.contains(FILE_KEY) && line.split(":").length > 1 && line.split(":")[1] != null) {
                            String strTrim = line.split(":")[1].trim();
                            try {
                                bufferedReader4.close();
                                return strTrim;
                            } catch (IOException e2) {
                                Logger.m75327e(TAG, "close cpuinfo io error :" + e2.getMessage());
                                return strTrim;
                            }
                        }
                    } catch (FileNotFoundException unused) {
                        bufferedReader2 = bufferedReader4;
                        Logger.m75327e(TAG, "can not find cpuinfo file");
                        bufferedReader = bufferedReader2;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                                bufferedReader = bufferedReader2;
                            } catch (IOException e3) {
                                e = e3;
                                sb = new StringBuilder("close cpuinfo io error :");
                                sb.append(e.getMessage());
                                Logger.m75327e(TAG, sb.toString());
                                return "";
                            }
                        }
                        return "";
                    } catch (IOException e4) {
                        e = e4;
                        bufferedReader3 = bufferedReader4;
                        Logger.m75327e(TAG, "read cpuinfo file error :" + e.getMessage());
                        bufferedReader = bufferedReader3;
                        if (bufferedReader3 != null) {
                            try {
                                bufferedReader3.close();
                                bufferedReader = bufferedReader3;
                            } catch (IOException e5) {
                                e = e5;
                                sb = new StringBuilder("close cpuinfo io error :");
                                sb.append(e.getMessage());
                                Logger.m75327e(TAG, sb.toString());
                                return "";
                            }
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader4;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e6) {
                                Logger.m75327e(TAG, "close cpuinfo io error :" + e6.getMessage());
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException e7) {
            e = e7;
        }
    }
}
