package com.aspose.slides.internal.p505xn;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.aspose.slides.internal.xn.c5 */
/* JADX INFO: loaded from: classes5.dex */
public class C12555c5 {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC6747ar f42067k4 = m58556x1();

    /* JADX INFO: renamed from: x1 */
    private static AbstractC6747ar f42068x1 = null;

    /* JADX INFO: renamed from: k4 */
    public static AbstractC6747ar m58551k4() {
        AbstractC6747ar abstractC6747ar = f42068x1;
        return abstractC6747ar != null ? abstractC6747ar : f42067k4;
    }

    /* JADX INFO: renamed from: x1 */
    private static AbstractC6747ar m58556x1() throws Throwable {
        String strM58554k4 = m58554k4("HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Control\\Nls\\CodePage", "ACP");
        if (strM58554k4 == null) {
            return m58552k4(1252);
        }
        try {
            return m58552k4(Integer.parseInt(strM58554k4));
        } catch (Exception unused) {
            return m58552k4(1252);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC6747ar m58552k4(int i) {
        return AbstractC6747ar.m26644to(i);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC6747ar m58553k4(String str) {
        return AbstractC6747ar.m26640kk(str);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m58554k4(String str, String str2) throws Throwable {
        Process processExec;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"reg", "query", str, "/v", str2});
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            if (processExec.waitFor() != 0) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                }
                                processExec.destroy();
                                return null;
                            }
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                            processExec.destroy();
                            return null;
                        }
                        if (line.contains(str2)) {
                            String[] strArrSplit = line.split("\\s+", 4);
                            if (strArrSplit.length == 4) {
                                String str3 = strArrSplit[3];
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused3) {
                                }
                                processExec.destroy();
                                return str3;
                            }
                        }
                    } catch (IOException unused4) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        return null;
                    } catch (InterruptedException unused6) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused8) {
                            }
                        }
                        if (processExec == null) {
                            throw th;
                        }
                        processExec.destroy();
                        throw th;
                    }
                }
            } catch (IOException unused9) {
                bufferedReader = null;
            } catch (InterruptedException unused10) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused11) {
            processExec = null;
            bufferedReader = null;
        } catch (InterruptedException unused12) {
            processExec = null;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            processExec = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m58555k4(AbstractC6747ar abstractC6747ar) {
        f42068x1 = abstractC6747ar;
    }
}
