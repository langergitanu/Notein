package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.aspose.words.ref.Ref;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzCT {
    static boolean[] zzuf = new boolean[128];
    private static boolean[] zzue = new boolean[128];
    private static boolean[] zzud = new boolean[128];

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add('\n');
        arrayList.add(Character.valueOf(ControlChar.PARAGRAPH_BREAK_CHAR));
        arrayList.add('\t');
        arrayList.add(Character.valueOf(IOUtils.DIR_SEPARATOR_WINDOWS));
        arrayList.add('\f');
        arrayList.add('\b');
        for (int i = 0; i < 32; i++) {
            arrayList.add(Character.valueOf((char) i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzuf[((Character) it.next()).charValue()] = true;
        }
        zzuf[39] = true;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            zzue[((Character) it2.next()).charValue()] = true;
        }
        zzue[34] = true;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            zzud[((Character) it3.next()).charValue()] = true;
        }
        char[] cArr = {'\"', '\'', '<', '>', '&'};
        for (int i2 = 0; i2 < 5; i2++) {
            zzud[cArr[i2]] = true;
        }
    }

    public static void zzZ(zzZOJ zzzoj, String str, boolean[] zArr, Ref<char[]> ref) {
        String str2;
        try {
            if (zzZKN.zzU3(str)) {
                return;
            }
            int iZzZ = zzZ(str, zArr, 0);
            if (iZzZ == -1) {
                zzzoj.write(str);
                return;
            }
            if (iZzZ != 0) {
                if (ref.get() == null || ref.get().length < iZzZ) {
                    ref.get();
                    ref.set(new char[iZzZ]);
                }
                zzZKN.zzZ(str, 0, ref.get(), 0, iZzZ);
                zzzoj.write(ref.get(), 0, iZzZ);
            }
            int i = iZzZ;
            while (iZzZ < str.length()) {
                char cCharAt = str.charAt(iZzZ);
                if (cCharAt >= zArr.length || zArr[cCharAt]) {
                    if (cCharAt == '\f') {
                        str2 = "\\f";
                    } else if (cCharAt == '\r') {
                        str2 = "\\r";
                    } else if (cCharAt == '\\') {
                        str2 = "\\\\";
                    } else if (cCharAt == 133) {
                        str2 = "\\u0085";
                    } else if (cCharAt == 8232) {
                        str2 = "\\u2028";
                    } else if (cCharAt != 8233) {
                        switch (cCharAt) {
                            case '\b':
                                str2 = "\\b";
                                break;
                            case '\t':
                                str2 = "\\t";
                                break;
                            case '\n':
                                str2 = "\\n";
                                break;
                            default:
                                if (cCharAt >= zArr.length) {
                                    str2 = null;
                                } else if (cCharAt == '\'') {
                                    str2 = "\\'";
                                } else if (cCharAt != '\"') {
                                    if (ref.get() == null || ref.get().length < 6) {
                                        ref.get();
                                        ref.set(new char[6]);
                                    }
                                    zzZYB.zzZ(cCharAt, ref.get());
                                    str2 = "!";
                                } else {
                                    str2 = "\\\"";
                                }
                                break;
                        }
                    } else {
                        str2 = "\\u2029";
                    }
                    if (str2 != null) {
                        boolean zZzh = zzZYD.zzh(str2, "!");
                        if (iZzZ > i) {
                            int i2 = (iZzZ - i) + (zZzh ? 6 : 0);
                            int i3 = zZzh ? 6 : 0;
                            if (ref.get() == null || ref.get().length < i2) {
                                char[] cArrZzZ = zzXG.zzZ(null, i2);
                                if (zZzh) {
                                    ref.get();
                                    System.arraycopy(ref.get(), 0, cArrZzZ, 0, 6);
                                }
                                ref.get();
                                ref.set(cArrZzZ);
                            }
                            int i4 = i2 - i3;
                            zzZKN.zzZ(str, i, ref.get(), i3, i4);
                            zzzoj.write(ref.get(), i3, i4);
                        }
                        i = iZzZ + 1;
                        if (zZzh) {
                            zzzoj.write(ref.get(), 0, 6);
                        } else {
                            zzzoj.write(str2);
                        }
                    }
                }
                iZzZ++;
            }
            int length = str.length() - i;
            if (length > 0) {
                if (ref.get() == null || ref.get().length < length) {
                    ref.get();
                    ref.set(new char[length]);
                }
                zzZKN.zzZ(str, i, ref.get(), 0, length);
                zzzoj.write(ref.get(), 0, length);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static int zzZ(String str, boolean[] zArr, int i) {
        for (int i2 = 0; i2 != str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < zArr.length) {
                if (zArr[cCharAt]) {
                    return i2;
                }
            } else {
                if (cCharAt == 133 || cCharAt == 8232 || cCharAt == 8233) {
                    return i2;
                }
            }
        }
        return -1;
    }
}
