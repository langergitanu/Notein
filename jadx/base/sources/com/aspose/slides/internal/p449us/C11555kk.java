package com.aspose.slides.internal.p449us;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p205ji.C5449c5;
import com.aspose.slides.internal.p234ko.C5894x1;
import com.aspose.slides.internal.p243l6.C6008to;
import com.aspose.slides.internal.p243l6.EnumC6002dy;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p412t0.InterfaceC10804kk;
import com.aspose.slides.internal.p505xn.C12560h4;
import com.aspose.slides.internal.p505xn.C12568qq;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14087rv;
import com.aspose.slides.p559ms.System.C14113y2;
import o00OoOoo.C25071OooO00o;

/* JADX INFO: renamed from: com.aspose.slides.internal.us.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C11555kk extends C11556x1 implements InterfaceC10804kk {

    /* JADX INFO: renamed from: c5 */
    public static String f39048c5;

    /* JADX INFO: renamed from: ck */
    public static String f39049ck;

    /* JADX INFO: renamed from: du */
    public static String f39050du;

    /* JADX INFO: renamed from: dy */
    public static String f39051dy;

    /* JADX INFO: renamed from: fa */
    public static String f39052fa;

    /* JADX INFO: renamed from: h4 */
    public static String f39053h4;

    /* JADX INFO: renamed from: jd */
    public static String f39054jd;

    /* JADX INFO: renamed from: k4 */
    public static String f39055k4;

    /* JADX INFO: renamed from: kk */
    public static String f39056kk;

    /* JADX INFO: renamed from: m9 */
    public static String f39057m9;

    /* JADX INFO: renamed from: to */
    public static String f39058to;

    /* JADX INFO: renamed from: x1 */
    public static String f39059x1;

    static {
        String str = C12560h4.f42069k4;
        String strOooO00o = C25071OooO00o.OooO00o("external{0}buildtools{0}", str, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39055k4 = strOooO00o;
        f39059x1 = C25071OooO00o.OooO00o("pdf-tools{0}AsposePdfValidator.exe", strOooO00o, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39056kk = C25071OooO00o.OooO00o("pdf-tools{0}pdfa.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39058to = C25071OooO00o.OooO00o("pdf2image{0}pdf2image.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39050du = C25071OooO00o.OooO00o("html2image{0}html2image.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39053h4 = C25071OooO00o.OooO00o("swf2image{0}Swf2Image.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39057m9 = C25071OooO00o.OooO00o("xps2image{0}XPS2Image.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39051dy = C25071OooO00o.OooO00o("xps-tools{0}amd64{0}isXps.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39048c5 = C25071OooO00o.OooO00o("xps-tools{0}x86{0}isXps.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39054jd = C25071OooO00o.OooO00o("imagecomparer{0}ImageComparer.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39049ck = C25071OooO00o.OooO00o("bff_validator{0}BFFValidator.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39052fa = C3141rv.m13412x1(str, "testdata/iccprofile/SampleIccCmmTestRunner.exe");
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: k4 */
    public final void mo52389k4(String str) {
        String str2 = C14052dq.m66567k4("ProgramFiles(x86)") != null ? f39051dy : f39048c5;
        int i = 1;
        String[] strArr = {null};
        int iM58663k4 = C12568qq.m58663k4(str2, C14113y2.m67402k4("\"-f={0}\"", str), strArr);
        String str3 = strArr[0];
        while (true) {
            if ((C14113y2.m67364dy(str3, "EXCEPTION System.UnauthorizedAccessException during test. Message: Access to the path") == -1 && C14113y2.m67364dy(str3, "EXCEPTION System.IO.IOException during test. Message: The process cannot access the file") == -1) || i > 4) {
                break;
            }
            strArr[0] = str3;
            iM58663k4 = C12568qq.m58663k4(str2, C14113y2.m67402k4("-f=\"{0}\"", str), strArr);
            str3 = strArr[0];
            i++;
        }
        C5894x1.f16672k4.println(C14113y2.m67402k4("Result: {0}\n{1}", Integer.valueOf(iM58663k4), str3));
        C5449c5.m22527x1(30);
        if (iM58663k4 != 0) {
            throw new InvalidOperationException(C14113y2.m67402k4("XPS file {1} does not conform: \n{0}", str3, str));
        }
    }

    /* JADX INFO: renamed from: kk */
    public void m54536kk(String str) {
        String strOooO00o = C25071OooO00o.OooO00o("external{0}", str, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39055k4 = strOooO00o;
        f39059x1 = C25071OooO00o.OooO00o("pdf-tools{0}AsposePdfValidator.exe", strOooO00o, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39056kk = C25071OooO00o.OooO00o("pdf-tools{0}pdfa.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39058to = C25071OooO00o.OooO00o("Pdf2image{0}pdf2image.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39053h4 = C25071OooO00o.OooO00o("swf2image{0}Swf2Image.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39057m9 = C25071OooO00o.OooO00o("xps2image{0}XPS2Image.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39051dy = C25071OooO00o.OooO00o("xps-tools{0}amd64{0}isXps.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39048c5 = C25071OooO00o.OooO00o("xps-tools{0}x86{0}isXps.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39054jd = C25071OooO00o.OooO00o("ImageComparer{0}ImageComparer.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39049ck = C25071OooO00o.OooO00o("BFFValidator{0}BFFValidator.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        f39050du = C25071OooO00o.OooO00o("html2image{0}html2image.exe", f39055k4, new Object[]{Character.valueOf(C3141rv.f9302kk)});
        C11556x1.m54537k4(C3141rv.m13406kk(C3141rv.m13412x1(str, "TestDataNet/Lic/Aspose.Total.Product.Family.lic")), str);
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: x1 */
    public final void mo52394x1(String str, String str2, int i, int i2, int i3, boolean z) {
        m54538k4(f39058to, str, str2, i, i2, i3, z);
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: k4 */
    public final void mo52390k4(String str, int i, String str2, int i2, boolean z) {
        C6008to c6008to = new C6008to();
        try {
            String strM13406kk = C3141rv.m13406kk(f39057m9);
            c6008to.m24278du().m24249kk(C3141rv.m13400h4(strM13406kk));
            c6008to.m24278du().m24256x1(C3141rv.m13403k4(strM13406kk));
            c6008to.m24278du().m24247k4(C14113y2.m67402k4("png {0} \"{1}\" {2} {3} \"{4}\"", Integer.valueOf(i2), C3141rv.m13406kk(str), Integer.valueOf(i), Boolean.valueOf(z), C3141rv.m13406kk(str2)));
            c6008to.m24278du().m24248k4(true);
            c6008to.m24278du().m24254to(true);
            c6008to.m24278du().m24246k4(EnumC6002dy.Hidden);
            c6008to.m24277c5();
            c6008to.m24280jd();
        } finally {
            c6008to.dispose();
        }
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: x1 */
    public final boolean mo52395x1(String str) {
        String strM13406kk = C3141rv.m13406kk(C14113y2.m67402k4("{0}/{1}.xml", C3141rv.m13400h4(str), C3141rv.m13411x1(str)));
        C6765kp c6765kpOooO00o = OooO00o.OooO00o(" -l ");
        c6765kpOooO00o.m26792k4(C14113y2.m67402k4("\"{0}\" ", strM13406kk));
        c6765kpOooO00o.m26792k4(C14113y2.m67408k4("\"", str, "\""));
        C6008to c6008to = new C6008to();
        try {
            boolean z = false;
            c6008to.m24278du().m24254to(false);
            c6008to.m24278du().m24256x1(f39049ck);
            c6008to.m24278du().m24248k4(true);
            c6008to.m24278du().m24247k4(c6765kpOooO00o.toString());
            c6008to.m24277c5();
            c6008to.m24280jd();
            int iM24281k4 = (int) (((long) c6008to.m24281k4()) & 4294967295L);
            if (iM24281k4 != -2147024809 && iM24281k4 != -536604048) {
                if (iM24281k4 != 0) {
                    throw new Exception(C14113y2.m67408k4(C14113y2.m67402k4("Command line: \"{0} {1}\". Tool exit with code {2} 0x", f39049ck, c6765kpOooO00o, Integer.valueOf(c6008to.m24281k4())), C14057f9.m66587k4(c6008to.m24281k4(), "X4")));
                }
                if (C3131h4.m13361kk(strM13406kk)) {
                    C3131h4.m13365x1(strM13406kk);
                }
                z = true;
            }
            return z;
        } finally {
            c6008to.dispose();
        }
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: k4 */
    public final void mo52391k4(String str, String str2, int i, int i2, int i3) {
        C14087rv.m67171x1(f39053h4);
        C14087rv.m67167k4(" \"{0}\" \"{1}\" {2} {3} {4}", str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        String[] strArr = {null};
        int iM58663k4 = C12568qq.m58663k4(f39053h4, C14113y2.m67402k4(" \"{0}\" \"{1}\" {2} {3} {4} 96", C3141rv.m13406kk(str), str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)), strArr);
        C14087rv.m67165k4("Result: {0}\n{1}", Integer.valueOf(iM58663k4), strArr[0]);
        if (iM58663k4 != 0) {
            throw new InvalidOperationException("Swf2Image execution failed.");
        }
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: k4 */
    public final void mo52392k4(String str, String str2, int i, int i2, int i3, boolean z) {
        m54540x1(f39050du, str, str2, i, i2, i3, z);
    }

    @Override // com.aspose.slides.internal.p412t0.InterfaceC10804kk
    /* JADX INFO: renamed from: k4 */
    public final void mo52393k4(String str, String str2, String str3) {
        m54539k4(f39059x1, false, str, str2, str3);
    }
}
