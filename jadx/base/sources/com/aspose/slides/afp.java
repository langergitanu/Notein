package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10458gz;
import com.aspose.slides.internal.p407st.C10383c4;
import com.aspose.slides.internal.p407st.C10411dw;
import com.aspose.slides.internal.p407st.C10417e8;
import com.aspose.slides.internal.p407st.C10433f7;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10504k5;
import com.aspose.slides.internal.p407st.C10527lq;
import com.aspose.slides.internal.p407st.C10569o2;
import com.aspose.slides.internal.p407st.C10578op;
import com.aspose.slides.internal.p407st.C10583p4;
import com.aspose.slides.internal.p407st.C10598q1;
import com.aspose.slides.internal.p407st.C10599q3;
import com.aspose.slides.internal.p407st.C10600q6;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10651tl;
import com.aspose.slides.internal.p407st.InterfaceC10392cw;
import com.aspose.slides.internal.p482wr.C12250c6;
import com.aspose.slides.internal.p505xn.C12567ne;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class afp extends C0969ey {

    /* JADX INFO: renamed from: k4 */
    private static final SortedList<C14047bz, String> f3896k4;

    static {
        SortedList<C14047bz, String> sortedList = new SortedList<>();
        f3896k4 = sortedList;
        sortedList.addItem(new C14047bz("6BF52A52-394A-11D3-B153-00C04F79FAA6"), "MPlayer");
        sortedList.addItem(new C14047bz("D27CDB6E-AE6D-11CF-96B8-444553540000"), "ShockwaveFlash");
        sortedList.addItem(new C14047bz("8BD21D10-EC42-11CE-9E0D-00AA006002F3"), "Forms.Textbox.1");
        sortedList.addItem(new C14047bz("8BD21D20-EC42-11CE-9E0D-00AA006002F3"), "Forms.ListBox.1");
        sortedList.addItem(new C14047bz("8BD21D30-EC42-11CE-9E0D-00AA006002F3"), "Forms.ComboBox.1");
        sortedList.addItem(new C14047bz("8BD21D40-EC42-11CE-9E0D-00AA006002F3"), "Forms.CheckBox.1");
        sortedList.addItem(new C14047bz("8BD21D50-EC42-11CE-9E0D-00AA006002F3"), "Forms.OptionButton.1");
        sortedList.addItem(new C14047bz("8BD21D60-EC42-11CE-9E0D-00AA006002F3"), "Forms.ToggleButton.1");
        sortedList.addItem(new C14047bz("79176FB0-B7F2-11CE-97EF-00AA006D2776"), "Forms.SpinButton.1");
        sortedList.addItem(new C14047bz("DFD181E0-5E2F-11CE-A449-00AA004A803D"), "Forms.ScrollBar.1");
        sortedList.addItem(new C14047bz("D7053240-CE69-11CD-A777-00DD01143C57"), "Forms.CommandButton.1");
        sortedList.addItem(new C14047bz("978C9E23-D4B0-11CE-BF2D-00AA003F40D0"), "Forms.Label.1");
        sortedList.addItem(new C14047bz("4C599241-6926-101B-9992-00000B65C6F9"), "Forms.Image.1");
        sortedList.addItem(new C14047bz("EAE50EB0-4A62-11CE-BED6-00AA00611080"), "Forms.TabStrip.1");
        sortedList.addItem(new C14047bz("6E182020-F460-11CE-9BCD-00AA00608E01"), "Forms.Frame.1");
        sortedList.addItem(new C14047bz("C62A69F0-16DC-11CE-9E98-00AA00574A4F"), "Forms.Form.1");
        sortedList.addItem(new C14047bz("1DC3219A-5AA7-4CF2-91B3-3A5DAD74F6F2"), "ANDPlayer.1");
    }

    /* JADX INFO: renamed from: k4 */
    public static long m3545k4(Control control, uz3 uz3Var) {
        C14872z4 c14872z4M1254x1;
        String strM67408k4;
        rpo rpoVarM3738du = uz3Var.m3745to().m3738du();
        y2n y2nVarM70215k4 = rpoVarM3738du.m70215k4();
        C10383c4 c10383c4 = new C10383c4();
        C10433f7 c10433f7M51710m9 = y2nVarM70215k4.m71954x1().m51483du().m50965m9().m51710m9();
        c10433f7M51710m9.m50513yj().addItem(c10383c4);
        C10504k5 c10504k5 = new C10504k5();
        c10504k5.m51094k4(control.getActiveXControlBinary());
        c10504k5.mo51093k4(y2nVarM70215k4.m71954x1().m51483du().m50957k4(c10504k5));
        C10417e8 c10417e8Mo50535to = c10383c4.mo50535to();
        c10417e8Mo50535to.m50730k4(1);
        c10417e8Mo50535to.m50736x1(2);
        long jM50689x1 = c10433f7M51710m9.m50785x1().m50689x1();
        c10433f7M51710m9.m50785x1().m50688k4(1 + jM50689x1);
        c10417e8Mo50535to.m50731k4(jM50689x1);
        if (control.m1254x1().m74310k4() == null) {
            control.m1254x1().m74313k4(m3549k4(control.m1252kk().Clone()));
            if (control.m1254x1().m74314x1() == null) {
                if (C14113y2.m67411k4(control.m1254x1().m74310k4())) {
                    c14872z4M1254x1 = control.m1254x1();
                    strM67408k4 = "";
                } else {
                    String[] strArrM67369h4 = C14113y2.m67369h4(control.m1254x1().m74310k4(), FilenameUtils.EXTENSION_SEPARATOR);
                    if (strArrM67369h4.length > 1) {
                        c14872z4M1254x1 = control.m1254x1();
                        strM67408k4 = C14113y2.m67408k4("Microsoft Forms 2.0 ", strArrM67369h4[1]);
                    } else {
                        control.m1254x1().m74315x1(C14113y2.m67408k4("Microsoft Forms 2.0 ", strArrM67369h4[0]));
                    }
                }
                c14872z4M1254x1.m74315x1(strM67408k4);
            }
        }
        c10417e8Mo50535to.m50733kk(m3556x1(control.m1254x1().m74310k4()));
        c10417e8Mo50535to.m50737x1(c10504k5.mo51092dy());
        c10383c4.mo50531du().m51658k4(control.getName());
        c10383c4.mo50533h4().m51658k4(control.m1254x1().m74310k4());
        c10383c4.mo50534m9().m51658k4(control.m1254x1().m74314x1());
        c10383c4.m50536x1().m51209k4(rpoVarM3738du.m70209fa().m51011to());
        return c10417e8Mo50535to.m50732kk();
    }

    /* JADX INFO: renamed from: kk */
    private static C14047bz m3554kk(String str) {
        C14047bz c14047bzClone = C14047bz.f47172k4.Clone();
        if (!C14113y2.m67411k4(str)) {
            IGenericEnumerator<KeyValuePair<C14047bz, String>> it = f3896k4.iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair<C14047bz, String> next = it.next();
                    if (C14113y2.m67448x1(C14113y2.m67368h4(str), C14113y2.m67368h4(next.getValue()))) {
                        return next.getKey();
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        return c14047bzClone;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m3556x1(String str) {
        if (str == null || C14113y2.m67363du(str, C14113y2.f47374k4)) {
            return 0;
        }
        String strM67368h4 = C14113y2.m67368h4(str);
        if (C14113y2.m67364dy(strM67368h4, "word.document") == 0) {
            return 2;
        }
        if (C14113y2.m67364dy(strM67368h4, "excel.sheet") == 0) {
            return 3;
        }
        if (C14113y2.m67364dy(strM67368h4, "msgraph") == 0) {
            return 4;
        }
        if (C14113y2.m67364dy(strM67368h4, "ogrchart") == 0 || C14113y2.m67364dy(strM67368h4, "msorgchart") == 0 || C14113y2.m67364dy(strM67368h4, "orgpluswopx") == 0) {
            return 5;
        }
        if (C14113y2.m67364dy(strM67368h4, "equation") == 0) {
            return 6;
        }
        if (C14113y2.m67364dy(strM67368h4, "mswordart") == 0) {
            return 7;
        }
        if (C14113y2.m67364dy(strM67368h4, "soundrec") == 0) {
            return 8;
        }
        if (C14113y2.m67364dy(strM67368h4, "msproject") == 0) {
            return 12;
        }
        if (C14113y2.m67364dy(strM67368h4, BackupFile.FILE_CONTENT_TYPE_NOTE) == 0) {
            return 13;
        }
        if (C14113y2.m67364dy(strM67368h4, "excel.chart") == 0) {
            return 14;
        }
        if (C14113y2.m67364dy(strM67368h4, "mplayer") == 0 || C14113y2.m67364dy(strM67368h4, "midfile") == 0 || C14113y2.m67364dy(strM67368h4, "avifile") == 0) {
            return 15;
        }
        if (C14113y2.m67364dy(strM67368h4, "wordpad") == 0) {
            return 16;
        }
        if (C14113y2.m67364dy(strM67368h4, "visio") == 0) {
            return 17;
        }
        if (C14113y2.m67364dy(strM67368h4, "word.opendocument") == 0) {
            return 18;
        }
        return C14113y2.m67364dy(strM67368h4, "excel.opendocument") == 0 ? 19 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0112  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m3546k4(OleObjectFrame oleObjectFrame, uz3 uz3Var) {
        C10504k5 c10504k5;
        C10583p4 c10583p4;
        String linkPathLong;
        C3152yj c3152yj;
        rpo rpoVarM3738du = uz3Var.m3745to().m3738du();
        y2n y2nVarM70215k4 = rpoVarM3738du.m70215k4();
        C10433f7 c10433f7M51710m9 = y2nVarM70215k4.m71954x1().m51483du().m50965m9().m51710m9();
        InterfaceC10392cw c10599q3 = oleObjectFrame.isObjectLink() ? new C10599q3() : new C10411dw();
        c10433f7M51710m9.m50513yj().addItem(c10599q3);
        if (oleObjectFrame.isObjectLink()) {
            C10578op c10578op = new C10578op();
            c10578op.m51437k4().m51994k4(1);
            c10578op.m51437k4().m51999k4(oleObjectFrame.mo1638uz().m5751c5().Clone());
            int iM67364dy = C14113y2.m67364dy(oleObjectFrame.getLinkPathLong(), "!");
            boolean zM67411k4 = C14113y2.m67411k4(oleObjectFrame.mo1638uz().m5753dy());
            C10569o2 c10569o2 = null;
            if (iM67364dy <= 0 || !zM67411k4) {
                c10578op.m51437k4().m52010x1(new C10598q1(new C10583p4()));
                c10583p4 = (C10583p4) c10578op.m51437k4().m51986c5().m51547x1();
            } else {
                C10583p4[] c10583p4Arr = {null};
                C10569o2[] c10569o2Arr = {null};
                c10578op.m51437k4().m52010x1(new C10598q1(m3548k4(c10583p4Arr, c10569o2Arr)));
                c10583p4 = c10583p4Arr[0];
                c10569o2 = c10569o2Arr[0];
            }
            try {
                if (zM67411k4) {
                    if (C14113y2.m67363du("???", oleObjectFrame.getLinkPathLong())) {
                        c10583p4.m51459k4(oleObjectFrame.getLinkPathLong());
                    } else if (iM67364dy > 0) {
                        String strM67443x1 = C14113y2.m67443x1(oleObjectFrame.getLinkPathLong(), 0, iM67364dy);
                        c10583p4.m51462x1(strM67443x1);
                        String strM67443x12 = C14113y2.m67443x1(oleObjectFrame.getLinkPathLong(), iM67364dy + 1, (oleObjectFrame.getLinkPathLong().length() - strM67443x1.length()) - 1);
                        c10569o2.m51395k4("!");
                        c10569o2.m51398x1(strM67443x12);
                    } else {
                        linkPathLong = oleObjectFrame.getLinkPathLong();
                    }
                    if (!C14113y2.m67411k4(oleObjectFrame.mo1638uz().m5766m9())) {
                        int iM67364dy2 = C14113y2.m67364dy(oleObjectFrame.mo1638uz().m5766m9(), "!");
                        if (iM67364dy2 > 0) {
                            C10583p4[] c10583p4Arr2 = {c10583p4};
                            C10569o2[] c10569o2Arr2 = {c10569o2};
                            c10578op.m51437k4().m51998k4(new C10598q1(m3548k4(c10583p4Arr2, c10569o2Arr2)));
                            C10583p4 c10583p42 = c10583p4Arr2[0];
                            C10569o2 c10569o22 = c10569o2Arr2[0];
                            String strM67443x13 = C14113y2.m67443x1(oleObjectFrame.mo1638uz().m5766m9(), 0, iM67364dy2);
                            c10583p42.m51459k4(C3141rv.m13412x1("..", strM67443x13));
                            String strM67443x14 = C14113y2.m67443x1(oleObjectFrame.mo1638uz().m5766m9(), iM67364dy2 + 1, (oleObjectFrame.mo1638uz().m5766m9().length() - strM67443x13.length()) - 1);
                            c10569o22.m51395k4("!");
                            c10569o22.m51398x1(strM67443x14);
                        } else {
                            c10578op.m51437k4().m51998k4(new C10598q1(new C10583p4()));
                            ((C10583p4) c10578op.m51437k4().m52004m9().m51547x1()).m51459k4(C3141rv.m13412x1("..", oleObjectFrame.mo1638uz().m5766m9()));
                        }
                    }
                    c3152yj = new C3152yj();
                    c10578op.m51440x1(c3152yj);
                    c10504k5 = new C10504k5();
                    c10504k5.m51094k4(c3152yj.toArray());
                } else {
                    linkPathLong = oleObjectFrame.mo1638uz().m5753dy();
                }
                c10578op.m51440x1(c3152yj);
                c10504k5 = new C10504k5();
                c10504k5.m51094k4(c3152yj.toArray());
            } finally {
                c3152yj.dispose();
            }
            c10583p4.m51462x1(linkPathLong);
            if (!C14113y2.m67411k4(oleObjectFrame.mo1638uz().m5766m9())) {
            }
            c3152yj = new C3152yj();
        } else {
            c10504k5 = new C10504k5();
            if (oleObjectFrame.mo268du().m71911x1()) {
                c10504k5.m51094k4(new byte[0]);
            } else {
                c10504k5.m51094k4(m3553k4(oleObjectFrame));
            }
        }
        c10504k5.mo51093k4(y2nVarM70215k4.m71954x1().m51483du().m50957k4(c10504k5));
        C10417e8 c10417e8Mo50535to = c10599q3.mo50535to();
        c10417e8Mo50535to.m50730k4(oleObjectFrame.mo1638uz().m5752du() > 0 ? oleObjectFrame.mo1638uz().m5752du() : oleObjectFrame.isObjectIcon() ? 4 : 1);
        c10417e8Mo50535to.m50736x1(oleObjectFrame.isObjectLink() ? 1 : 0);
        long jM50689x1 = c10433f7M51710m9.m50785x1().m50689x1();
        c10433f7M51710m9.m50785x1().m50688k4(1 + jM50689x1);
        c10417e8Mo50535to.m50731k4(jM50689x1);
        c10417e8Mo50535to.m50733kk(m3556x1(oleObjectFrame.getObjectProgId()));
        exs exsVarMo1638uz = oleObjectFrame.mo1638uz();
        c10417e8Mo50535to.m50737x1(c10504k5.mo51092dy());
        if (oleObjectFrame.isObjectLink()) {
            C10651tl c10651tlM51549x1 = ((C10599q3) c10599q3).m51549x1();
            c10651tlM51549x1.m51754k4(rpoVarM3738du.m70209fa().m51011to());
            c10651tlM51549x1.m51753k4(oleObjectFrame.getUpdateAutomatic() ? 1 : 3);
        } else {
            C10600q6 c10600q6M50714x1 = ((C10411dw) c10599q3).m50714x1();
            c10600q6M50714x1.m51551k4(exsVarMo1638uz.m5756k4());
            c10600q6M50714x1.m51550k4(exsVarMo1638uz.m5768x1());
            c10600q6M50714x1.m51553kk(exsVarMo1638uz.m5767to());
            c10600q6M50714x1.m51556x1(exsVarMo1638uz.m5763kk());
        }
        c10599q3.mo50531du().m51658k4(oleObjectFrame.getObjectName());
        c10599q3.mo50533h4().m51658k4(oleObjectFrame.getObjectProgId());
        c10599q3.mo50534m9().m51658k4(exsVarMo1638uz.m5754h4());
        return c10417e8Mo50535to.m50732kk();
    }

    /* JADX INFO: renamed from: kk */
    public static void m3555kk(qah qahVar) {
        oei oeiVar = (oei) qahVar.m69481du();
        if (oeiVar.m4521x1() == null) {
            throw new InvalidDataException("No linked ExOleContainer for OleControl shape!");
        }
        if (oeiVar.m4520kk() == null) {
            throw new InvalidDataException("No ExStg data for OleControl shape!");
        }
        Control controlM68480k4 = oeiVar.m68480k4();
        C10383c4 c10383c4 = (C10383c4) oeiVar.m4521x1();
        C14872z4 c14872z4M1254x1 = controlM68480k4.m1254x1();
        AbstractC10458gz abstractC10458gzM69489kk = qahVar.m69489kk();
        tbp tbpVar = new tbp();
        tbp tbpVar2 = new tbp();
        C1258im c1258im = new C1258im();
        tbp[] tbpVarArr = {tbpVar};
        tbp[] tbpVarArr2 = {tbpVar2};
        C1258im[] c1258imArr = {c1258im};
        xbk.m73301k4(abstractC10458gzM69489kk, tbpVarArr, tbpVarArr2, c1258imArr);
        tbpVarArr[0].CloneTo(tbpVar);
        tbpVarArr2[0].CloneTo(tbpVar2);
        c1258imArr[0].CloneTo(c1258im);
        controlM68480k4.setFrame(new ShapeFrame(tbpVar.f49090k4, tbpVar.f49091x1, tbpVar2.f49090k4, tbpVar2.f49091x1, c1258im.f5733to ? (byte) 1 : (byte) 0, c1258im.f5732kk ? (byte) 1 : (byte) 0, c1258im.f5734x1));
        controlM68480k4.m1251k4(oeiVar.m4520kk().m51095kk());
        controlM68480k4.m1248k4(m3554kk(c10383c4.mo50533h4().m51659x1()).Clone());
        m3551k4((PictureFillFormat) controlM68480k4.getSubstitutePictureFormat(), oeiVar);
        controlM68480k4.setName(c10383c4.mo50531du() != null ? c10383c4.mo50531du().m51659x1() : C14113y2.f47374k4);
        k3x.m63629k4(c14872z4M1254x1, abstractC10458gzM69489kk);
        c14872z4M1254x1.m74312k4(c10383c4.mo50535to());
        c14872z4M1254x1.m74313k4(c10383c4.mo50533h4().m51659x1());
        c14872z4M1254x1.m74315x1(c10383c4.mo50534m9().m51659x1());
        c14872z4M1254x1.m74311k4(c10383c4.m50532dy());
    }

    /* JADX INFO: renamed from: x1 */
    private static void m3557x1(c9v c9vVar) {
        C10411dw c10411dw = (C10411dw) c9vVar.m4521x1();
        C10504k5 c10504k5M4520kk = c9vVar.m4520kk();
        OleObjectFrame oleObjectFrame = (OleObjectFrame) C7019kk.m27452k4((Object) c9vVar.m70148u4(), OleObjectFrame.class);
        if (oleObjectFrame.getPlaceholder() != null && (oleObjectFrame.getPlaceholder().getType() == 4 || oleObjectFrame.getPlaceholder().getType() == 5)) {
            c9vVar.m70139ck();
            c9vVar.m70149up().m64738wl().removeItemByKey(Long.valueOf(c9vVar.m70152x6().m69479c5()));
            return;
        }
        try {
            oleObjectFrame.m2080k4(c10504k5M4520kk.m51095kk());
        } catch (C12250c6 unused) {
            ISlide iSlide = (ISlide) C7019kk.m27452k4((Object) c9vVar.m70149up().m64735up(), ISlide.class);
            c9vVar.m70149up().m64712du().m3185k4(iSlide != null ? C14113y2.m67408k4("Embedded OLE-object on slide #", C14057f9.m66591x1(iSlide.getSlideNumber()), " is corrupted: ") : "Embedded OLE-object is corrupted", 1);
            oleObjectFrame.mo268du().m71910k4(true);
        }
        if (oleObjectFrame.m2090yj() != null && oleObjectFrame.m2090yj().length > 0) {
            C3152yj c3152yj = new C3152yj(oleObjectFrame.m2090yj());
            try {
                if (!dbk.m5034k4(c3152yj, oleObjectFrame, c9vVar.m70149up().m64715h4().m4229k4())) {
                    String strM67361du = C14113y2.m67361du(oleObjectFrame.getObjectProgId());
                    if (gbd.m6466k4().containsKey(strM67361du)) {
                        oleObjectFrame.m2078k4(gbd.m6466k4().get_Item(strM67361du).m69540du());
                        oleObjectFrame.m2084rv().m2069k4(gbd.m6466k4().get_Item(strM67361du).m69541k4());
                    }
                }
            } finally {
                c3152yj.dispose();
            }
        }
        exs exsVarMo1638uz = oleObjectFrame.mo1638uz();
        exsVarMo1638uz.m5757k4(c10411dw.m50714x1().m51555x1());
        exsVarMo1638uz.m5769x1(c10411dw.m50714x1().m51552kk());
        exsVarMo1638uz.m5764kk(c10411dw.m50714x1().m51554to());
        exsVarMo1638uz.m5759k4(c10411dw.m50713dy());
        if (oleObjectFrame.m2090yj() == null) {
            oleObjectFrame.m2076k4(new OleEmbeddedDataInfo());
            return;
        }
        if (oleObjectFrame.m2084rv().getEmbeddedFileData() == null) {
            oleObjectFrame.m2084rv().m2070k4(oleObjectFrame.m2090yj());
        }
        if (C14113y2.m67411k4(oleObjectFrame.m2084rv().getEmbeddedFileExtension())) {
            oleObjectFrame.m2084rv().m2069k4("bin");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C10462h9 m3547k4(ri7 ri7Var) {
        C10462h9 c10462h9M70140fa = ri7Var.m70140fa();
        if (c10462h9M70140fa == null || c10462h9M70140fa.mo50862jd() == null || c10462h9M70140fa.mo50862jd().m50426du() == null) {
            throw new PptException("Frame is not an OleObjectFrame_PPT.");
        }
        return c10462h9M70140fa;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m3558x1(qah qahVar) {
        c9v c9vVar = (c9v) qahVar.m69481du();
        if (c9vVar.m4521x1() == null) {
            throw new InvalidDataException("No linked ExOleContainer for OleObject shape!");
        }
        if (c9vVar.m4520kk() == null) {
            throw new InvalidDataException("No ExStg data for OleObject shape!");
        }
        OleObjectFrame oleObjectFrame = (OleObjectFrame) C7019kk.m27452k4((Object) c9vVar.m70148u4(), OleObjectFrame.class);
        if (oleObjectFrame == null) {
            throw new NullReferenceException("OleObjectFrame isn't created!");
        }
        C0969ey.m5775k4(qahVar);
        InterfaceC10392cw interfaceC10392cw = (InterfaceC10392cw) c9vVar.m4521x1();
        PictureFillFormat pictureFillFormat = new PictureFillFormat(oleObjectFrame);
        oleObjectFrame.f2885x1 = pictureFillFormat;
        m3551k4(pictureFillFormat, c9vVar);
        m3550k4(oleObjectFrame, c9vVar);
        String str = "";
        oleObjectFrame.setObjectProgId(interfaceC10392cw.mo50533h4() != null ? interfaceC10392cw.mo50533h4().m51659x1() : "");
        oleObjectFrame.setObjectName(interfaceC10392cw.mo50531du() != null ? interfaceC10392cw.mo50531du().m51659x1() : "");
        oleObjectFrame.setObjectIcon(interfaceC10392cw.mo50535to().m50735x1() != 1);
        oleObjectFrame.mo1638uz().m5758k4(interfaceC10392cw.mo50535to().m50735x1());
        oleObjectFrame.mo1638uz().m5762k4(interfaceC10392cw.mo50534m9() != null ? interfaceC10392cw.mo50534m9().m51659x1() : "");
        C14680vi.m72289k4((FillFormat) oleObjectFrame.getFillFormat(), c9vVar);
        tcp.m71097k4(oleObjectFrame.getLineFormat(), (byte) 2, false, (ri7) c9vVar);
        C14200nt.m68199k4(oleObjectFrame.getEffectFormat(), c9vVar);
        int iM51404bv = c9vVar.m4521x1().m51404bv() & 65535;
        if (iM51404bv == 4044) {
            m3557x1(c9vVar);
        } else {
            if (iM51404bv != 4046) {
                throw new ArgumentOutOfRangeException("Unknown ExContainer for OleObjectFrame!");
            }
            m3552k4(c9vVar);
        }
        PPImage pPImage = (PPImage) oleObjectFrame.getSubstitutePictureFormat().getPicture().getImage();
        if (oleObjectFrame.isObjectIcon() && pPImage != null && pPImage.m2129jd()) {
            if ("image/x-wmf".equals(pPImage.getContentType())) {
                String[] strArr = {""};
                C3099wl.m13192k4(pPImage.getBinaryData(), strArr);
                str = strArr[0];
            } else if ("image/x-emf".equals(pPImage.getContentType())) {
                String[] strArr2 = {""};
                C3099wl.m13200x1(pPImage.getBinaryData(), strArr2);
                str = strArr2[0];
            }
            oleObjectFrame.f2871du = str;
            oleObjectFrame.f2881to = pPImage.m2128h4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C10527lq m3548k4(C10583p4[] c10583p4Arr, C10569o2[] c10569o2Arr) {
        C10527lq c10527lq = new C10527lq();
        c10527lq.m51211k4(2L);
        c10583p4Arr[0] = new C10583p4();
        c10569o2Arr[0] = new C10569o2();
        c10527lq.m51212k4(new C10598q1[]{new C10598q1(c10583p4Arr[0]), new C10598q1(c10569o2Arr[0])});
        return c10527lq;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m3549k4(C14047bz c14047bz) {
        if (C14047bz.m66535k4(c14047bz, C14047bz.f47172k4)) {
            return "";
        }
        String[] strArr = {null};
        return !f3896k4.tryGetValue(c14047bz.Clone(), strArr) ? "" : strArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3550k4(OleObjectFrame oleObjectFrame, ri7 ri7Var) {
        if (oleObjectFrame == null) {
            throw new ArgumentNullException("pictureFillFormat");
        }
        C10609qn c10609qn = (C10609qn) C7019kk.m27452k4((Object) m3547k4(ri7Var).mo50859du().m51263x1().m50923k4(StyleIdentifier.PLAIN_TABLE_1), C10609qn.class);
        if (c10609qn != null) {
            oleObjectFrame.mo1638uz().m5761k4(new C14093tq<>(Long.valueOf(c10609qn.m51597ar())));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3551k4(PictureFillFormat pictureFillFormat, ri7 ri7Var) {
        if (pictureFillFormat == null) {
            throw new ArgumentNullException("pictureFillFormat");
        }
        m3547k4(ri7Var);
        pictureFillFormat.setPictureFillMode(1);
        moa.m64927k4(pictureFillFormat, 4294967295L, ri7Var);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3552k4(c9v c9vVar) {
        C10578op c10578op;
        C10599q3 c10599q3 = (C10599q3) c9vVar.m4521x1();
        C10504k5 c10504k5M4520kk = c9vVar.m4520kk();
        OleObjectFrame oleObjectFrame = (OleObjectFrame) C7019kk.m27452k4((Object) c9vVar.m70148u4(), OleObjectFrame.class);
        oleObjectFrame.m2089x1(true);
        try {
            c10578op = new C10578op(c10504k5M4520kk.m51095kk());
        } catch (EndOfStreamException e) {
            ISlide iSlide = (ISlide) C7019kk.m27452k4((Object) c9vVar.m70149up().m64735up(), ISlide.class);
            c9vVar.m70149up().m64712du().m3185k4(C14113y2.m67408k4(iSlide != null ? C14113y2.m67408k4("OleObject on slide #", C14057f9.m66591x1(iSlide.getSlideNumber()), " is corrupted: ") : "OleObject is corrupted: ", e.getMessage()), 1);
            c10578op = null;
        }
        if (c10578op != null && c10578op.m51437k4() != null) {
            C10598q1 c10598q1M51986c5 = c10578op.m51437k4().m51986c5();
            C10583p4 c10583p4 = (C10583p4) C7019kk.m27452k4((Object) c10598q1M51986c5.m51547x1(), C10583p4.class);
            if (c10583p4 != null) {
                String strM51457jd = c10583p4.m51457jd();
                oleObjectFrame.f2874k4 = strM51457jd;
                if (strM51457jd == null) {
                    oleObjectFrame.f2874k4 = c10583p4.m51456h4();
                }
                oleObjectFrame.mo1638uz().m5765kk(oleObjectFrame.f2874k4);
            } else {
                C10527lq c10527lq = (C10527lq) C7019kk.m27452k4((Object) c10598q1M51986c5.m51547x1(), C10527lq.class);
                if (c10527lq != null) {
                    oleObjectFrame.f2874k4 = c10527lq.mo50993to();
                }
            }
            if (c10598q1M51986c5.m51547x1() != null) {
                oleObjectFrame.m2081kk(c10598q1M51986c5.m51547x1().mo50993to());
            }
            try {
                C10598q1 c10598q1M52004m9 = c10578op.m51437k4().m52004m9();
                if (c10598q1M52004m9 != null) {
                    String strMo50993to = C14113y2.f47374k4;
                    C10583p4 c10583p42 = (C10583p4) C7019kk.m27452k4((Object) c10598q1M52004m9.m51547x1(), C10583p4.class);
                    if (c10583p42 != null) {
                        strMo50993to = c10583p42.m51457jd();
                        if (C14113y2.m67411k4(strMo50993to)) {
                            strMo50993to = c10583p42.m51456h4();
                        }
                    } else {
                        C10527lq c10527lq2 = (C10527lq) C7019kk.m27452k4((Object) c10598q1M52004m9.m51547x1(), C10527lq.class);
                        if (c10527lq2 != null) {
                            strMo50993to = c10527lq2.mo50993to();
                        }
                    }
                    if (!C14113y2.m67411k4(strMo50993to) && !C3141rv.m13409m9(strMo50993to) && !C14113y2.m67363du("???", strMo50993to)) {
                        if (C14113y2.m67448x1(strMo50993to, C14113y2.m67407k4("..", Character.valueOf(C3141rv.f9302kk))) && strMo50993to.length() > 3) {
                            strMo50993to = C14113y2.m67422kk(strMo50993to, 3);
                        }
                        if (C12567ne.f42086x1 || C12567ne.f42084kk) {
                            strMo50993to = C14113y2.m67393k4(strMo50993to, IOUtils.DIR_SEPARATOR_WINDOWS, C3141rv.f9302kk);
                        }
                        oleObjectFrame.mo1638uz().m5770x1(strMo50993to);
                        if (!C14113y2.m67411k4(c9vVar.m70149up().m64712du().m71946k4().f3114x1)) {
                            oleObjectFrame.f2874k4 = new C14062gk(C3141rv.m13412x1(C3141rv.m13400h4(c9vVar.m70149up().m64712du().m71946k4().f3114x1), C14113y2.m67431to(strMo50993to, C3141rv.f9302kk))).m66677ck();
                        }
                    }
                }
            } catch (ArgumentException e2) {
                C3085sv.m13082k4(e2);
                oleObjectFrame.f2874k4 = "???";
            } catch (RuntimeException e3) {
                C3085sv.m13082k4(e3);
                if (!C14113y2.m67411k4(oleObjectFrame.mo1638uz().m5753dy())) {
                    oleObjectFrame.f2874k4 = oleObjectFrame.mo1638uz().m5753dy();
                }
            }
            oleObjectFrame.mo1638uz().m5760k4(c10578op.m51437k4().m51987ck().Clone());
        }
        oleObjectFrame.f2872h4 = c10599q3.m51549x1().m51755x1() == 1;
        oleObjectFrame.mo1638uz().m5759k4(c10599q3.m51548dy());
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m3553k4(OleObjectFrame oleObjectFrame) {
        int iIndexOfValue;
        byte[] embeddedFileData = oleObjectFrame.m2084rv().getEmbeddedFileData();
        if (embeddedFileData != null && embeddedFileData.length > 0 && embeddedFileData.length == oleObjectFrame.m2090yj().length) {
            String strM67368h4 = C14113y2.m67368h4(oleObjectFrame.getObjectProgId());
            qdi[] qdiVarArr = {null};
            boolean z = false;
            if (gbd.m6466k4().tryGetValue(strM67368h4, qdiVarArr) && qdiVarArr[0].m69543to()) {
                z = true;
            }
            if (z && (iIndexOfValue = gbd.m6487x1().indexOfValue(strM67368h4)) != -1) {
                return gbd.m6490x1(embeddedFileData, strM67368h4, gbd.m6487x1().getKeys().get_Item(iIndexOfValue).Clone());
            }
        }
        return oleObjectFrame.m2090yj();
    }
}
