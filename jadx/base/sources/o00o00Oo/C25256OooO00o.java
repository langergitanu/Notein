package o00o00Oo;

import android.content.Context;
import com.orion.notein.domain.models.p605ai.AiFeatureConfig;
import com.orion.notein.global.R;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OOo.InterfaceC33701OooOO0o;
import oO0o0OOo.InterfaceC33709OooOo;
import oO0o0Oo.C33725OooOO0;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: o00o00Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25256OooO00o implements InterfaceC25255OooO {
    public static final long OooO0OO(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
        }
        if (i2 >= 0) {
            long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
            int i3 = C34696OooOOoo.f124979OooO0OO;
            return j;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
    }

    public static String OooO0Oo(int i, int i2, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        while (i < i2) {
            sb.append(String.format("%02x ", Byte.valueOf(bArr[i])));
            i++;
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String OooO0o(Context context, String str, AiFeatureConfig aiFeatureConfig) {
        String string;
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        if (str == null) {
            string = context.getString(R.string.unknown_error);
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != 325557075) {
                if (iHashCode != 1448635047) {
                    if (iHashCode != 1457223782) {
                        switch (iHashCode) {
                            case 1534522494:
                                if (str.equals("400002")) {
                                    string = context.getString(R.string.error_pdf_info_not_found);
                                    break;
                                }
                                break;
                            case 1534522495:
                                if (str.equals("400003")) {
                                    string = context.getString(R.string.error_pdf_file_not_found);
                                    break;
                                }
                                break;
                            case 1534522496:
                                if (str.equals("400004")) {
                                    long j = 1024;
                                    long maxPdfFileBytes = ((aiFeatureConfig != null ? aiFeatureConfig.getMaxPdfFileBytes() : AiFeatureConfig.DEFAULT_MAX_PDF_FILE_SIZE) / j) / j;
                                    if (maxPdfFileBytes < 1) {
                                        maxPdfFileBytes = 1;
                                    }
                                    string = context.getString(R.string.error_pdf_file_too_large, Integer.valueOf((int) maxPdfFileBytes), Integer.valueOf(aiFeatureConfig != null ? aiFeatureConfig.getMaxNumOfPdfPages() : 1000));
                                    break;
                                }
                                break;
                            case 1534522497:
                                if (str.equals("400005")) {
                                    string = context.getString(R.string.error_pdf_file_no_record);
                                    break;
                                }
                                break;
                            case 1534522498:
                                if (str.equals("400006")) {
                                    string = context.getString(R.string.error_unable_to_upload);
                                    break;
                                }
                                break;
                            case 1534522499:
                                if (str.equals("400007")) {
                                    string = context.getString(R.string.error_unable_to_analyze);
                                    break;
                                }
                                break;
                            case 1534522500:
                                if (str.equals("400008")) {
                                    string = context.getString(R.string.content_dialog_ai_quota_used_up);
                                    break;
                                }
                                break;
                        }
                    } else if (str.equals("199997")) {
                        string = context.getString(R.string.error_toast_app_min_version);
                    }
                } else if (str.equals("100008")) {
                    string = context.getString(R.string.error_toast_app_check_failed);
                }
            } else if (str.equals("4000010")) {
                string = context.getString(R.string.error_unable_to_report_cost);
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:24:0x0054, B:28:0x0069, B:30:0x0071, B:20:0x0046, B:23:0x0050), top: B:44:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0083 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(InterfaceC33723OooO0oO interfaceC33723OooO0oO, InterfaceC33709OooOo interfaceC33709OooOo, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33725OooOO0 c33725OooOO0;
        InterfaceC33701OooOO0o it;
        InterfaceC33701OooOO0o interfaceC33701OooOO0o;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C33725OooOO0) {
            c33725OooOO0 = (C33725OooOO0) abstractC32479OooO0OO;
            int i = c33725OooOO0.f121531OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33725OooOO0.f121531OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c33725OooOO0 = new C33725OooOO0(abstractC32479OooO0OO);
            }
        }
        Object obj = c33725OooOO0.f121530OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33725OooOO0.f121531OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
                it = interfaceC33709OooOo.iterator();
                c33725OooOO0.f121527OooOo0o = interfaceC33723OooO0oO;
                c33725OooOO0.f121526OooOo = interfaceC33709OooOo;
                c33725OooOO0.f121529OooOoO0 = it;
                c33725OooOO0.f121528OooOoO = z;
                c33725OooOO0.f121531OooOoo0 = 1;
                objOooO00o = it.OooO00o(c33725OooOO0);
                if (objOooO00o != enumC32485OooO00o) {
                }
            } else if (i2 == 1) {
                z = c33725OooOO0.f121528OooOoO;
                interfaceC33701OooOO0o = c33725OooOO0.f121529OooOoO0;
                interfaceC33709OooOo = c33725OooOO0.f121526OooOo;
                interfaceC33723OooO0oO2 = c33725OooOO0.f121527OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = c33725OooOO0.f121528OooOoO;
                interfaceC33701OooOO0o = c33725OooOO0.f121529OooOoO0;
                interfaceC33709OooOo = c33725OooOO0.f121526OooOo;
                interfaceC33723OooO0oO2 = c33725OooOO0.f121527OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                it = interfaceC33701OooOO0o;
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                c33725OooOO0.f121527OooOo0o = interfaceC33723OooO0oO;
                c33725OooOO0.f121526OooOo = interfaceC33709OooOo;
                c33725OooOO0.f121529OooOoO0 = it;
                c33725OooOO0.f121528OooOoO = z;
                c33725OooOO0.f121531OooOoo0 = 1;
                objOooO00o = it.OooO00o(c33725OooOO0);
                if (objOooO00o != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                interfaceC33701OooOO0o = it;
                obj = objOooO00o;
                if (((Boolean) obj).booleanValue()) {
                    if (z) {
                        interfaceC33709OooOo.cancel(null);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                Object next = interfaceC33701OooOO0o.next();
                c33725OooOO0.f121527OooOo0o = interfaceC33723OooO0oO2;
                c33725OooOO0.f121526OooOo = interfaceC33709OooOo;
                c33725OooOO0.f121529OooOoO0 = interfaceC33701OooOO0o;
                c33725OooOO0.f121528OooOoO = z;
                c33725OooOO0.f121531OooOoo0 = 2;
            }
        } finally {
        }
    }

    @Override // o00o00Oo.InterfaceC25255OooO
    public void OooO00o(InterfaceC25265OooOO0O interfaceC25265OooOO0O) {
        interfaceC25265OooOO0O.onStart();
    }

    @Override // o00o00Oo.InterfaceC25255OooO
    public void OooO0O0(InterfaceC25265OooOO0O interfaceC25265OooOO0O) {
    }
}
