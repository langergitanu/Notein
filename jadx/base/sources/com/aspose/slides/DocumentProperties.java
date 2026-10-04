package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class DocumentProperties implements IDocumentProperties, IGenericCloneable<IDocumentProperties>, Cloneable {

    /* JADX INFO: renamed from: du */
    private C14084qq[] f2120du;

    /* JADX INFO: renamed from: h4 */
    private boolean[] f2121h4;

    /* JADX INFO: renamed from: k4 */
    private SortedList<String, Object> f2122k4;

    /* JADX INFO: renamed from: kk */
    private C14077m4 f2123kk;

    /* JADX INFO: renamed from: m9 */
    private Presentation f2124m9;

    /* JADX INFO: renamed from: to */
    private String[] f2125to;

    /* JADX INFO: renamed from: x1 */
    private int f2126x1;

    public DocumentProperties() {
        this.f2122k4 = new SortedList<>(AbstractC14070jw.m66790x1());
        this.f2123kk = new C14077m4();
        this.f2124m9 = null;
        m1331dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m1331dy() {
        this.f2125to = new String[16];
        this.f2120du = (C14084qq[]) C22200OooO0o0.OooO00o(C14084qq.class, 3);
        this.f2121h4 = new boolean[3];
        clearBuiltInProperties();
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void clearBuiltInProperties() {
        for (int i = 0; i < 16; i++) {
            this.f2125to[i] = C14113y2.f47374k4;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            C14084qq.m67081jd().CloneTo(this.f2120du[i2]);
        }
        for (int i3 = 0; i3 < 3; i3++) {
            this.f2121h4[i3] = false;
        }
        C14077m4.f47265kk.CloneTo(this.f2123kk);
        this.f2126x1 = 1;
        String[] strArrM67414k4 = C14113y2.m67414k4("24.6", FilenameUtils.EXTENSION_SEPARATOR);
        m1337k4(C14113y2.m67402k4("{0:00}.{1:00}{2:00}", 24, 6, Integer.valueOf(strArrM67414k4.length > 2 ? C14057f9.m66582k4(strArrM67414k4[2]) : 0)));
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void clearCustomProperties() {
        this.f2122k4.clear();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.aspose.slides.IGenericCloneable
    public final IDocumentProperties cloneT() {
        DocumentProperties documentProperties = (DocumentProperties) memberwiseClone();
        documentProperties.f2122k4 = new SortedList<>();
        IGenericEnumerator<KeyValuePair<String, Object>> it = this.f2122k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<String, Object> next = it.next();
                documentProperties.f2122k4.addItem(next.getKey(), next.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        documentProperties.f2124m9 = null;
        return documentProperties;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final boolean containsCustomProperty(String str) {
        return this.f2122k4.containsKey(str);
    }

    public final Object deepClone() {
        return cloneT();
    }

    /* JADX INFO: renamed from: du */
    public final boolean m1332du() {
        return this.f2121h4[1];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getAppVersion() {
        return this.f2125to[15];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getApplicationTemplate() {
        return this.f2125to[13];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getAuthor() {
        return this.f2125to[2];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getCategory() {
        return this.f2125to[5];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getComments() {
        return this.f2125to[4];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getCompany() {
        return this.f2125to[10];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getContentStatus() {
        return this.f2125to[6];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getContentType() {
        return this.f2125to[7];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final int getCountOfCustomProperties() {
        return this.f2122k4.size();
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final Date getCreatedTime() {
        return C14084qq.m67108kk(m1347x1());
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getCustomPropertyName(int i) {
        if (i < 0 || i >= getCountOfCustomProperties()) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), "Property index is out of range.");
        }
        return this.f2122k4.getKeys().get_Item(i);
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void getCustomPropertyValue(String str, double[] dArr) {
        dArr[0] = ((Double) C7019kk.m27464to(m1348x1(str), Double.TYPE)).doubleValue();
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getHyperlinkBase() {
        return this.f2125to[14];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getKeywords() {
        return this.f2125to[3];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final Date getLastPrinted() {
        return C14084qq.m67108kk(m1345to());
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getLastSavedBy() {
        return this.f2125to[8];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final Date getLastSavedTime() {
        return C14084qq.m67108kk(m1342kk());
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getManager() {
        return this.f2125to[11];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getNameOfApplication() {
        return this.f2125to[9];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getPresentationFormat() {
        return this.f2125to[12];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final int getRevisionNumber() {
        return this.f2126x1;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final boolean getSharedDoc() {
        return this.f2121h4[0];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getSubject() {
        return this.f2125to[1];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final String getTitle() {
        return this.f2125to[0];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final double getTotalEditingTime() {
        return C14077m4.m66796h4(m1334k4());
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final Object get_Item(String str) {
        Object objM67108kk = this.f2122k4.get_Item(str);
        if (objM67108kk != null && (objM67108kk instanceof C14084qq)) {
            objM67108kk = C14084qq.m67108kk((C14084qq) objM67108kk);
        }
        return (objM67108kk == null || !(objM67108kk instanceof C14077m4)) ? objM67108kk : Long.valueOf(C14077m4.m66793du((C14077m4) objM67108kk)).toString();
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m1333h4() {
        return this.f2121h4[2];
    }

    /* JADX INFO: renamed from: k4 */
    public C14077m4 m1334k4() {
        return this.f2123kk;
    }

    /* JADX INFO: renamed from: kk */
    public C14084qq m1342kk() {
        return this.f2120du[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m9 */
    public final boolean m1344m9() {
        List list = new List();
        list.addItem("Microsoft Office PowerPoint");
        list.addItem("Microsoft PowerPoint");
        list.addItem("Aspose.Slides for");
        list.addItem("Microsoft Macintosh PowerPoint");
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                if (C14113y2.m67448x1(getNameOfApplication(), (String) it.next())) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    public Object memberwiseClone() {
        try {
            DocumentProperties documentProperties = (DocumentProperties) super.clone();
            C14084qq[] c14084qqArr = this.f2120du;
            if (c14084qqArr != null) {
                documentProperties.f2120du = (C14084qq[]) Arrays.copyOf(c14084qqArr, c14084qqArr.length);
            }
            boolean[] zArr = this.f2121h4;
            if (zArr != null) {
                documentProperties.f2121h4 = Arrays.copyOf(zArr, zArr.length);
            }
            String[] strArr = this.f2125to;
            if (strArr != null) {
                documentProperties.f2125to = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            return documentProperties;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final boolean removeCustomProperty(String str) {
        if (!this.f2122k4.containsKey(str)) {
            return false;
        }
        this.f2122k4.removeItemByKey(str);
        return true;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setApplicationTemplate(String str) {
        this.f2125to[13] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setAuthor(String str) {
        this.f2125to[2] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setCategory(String str) {
        this.f2125to[5] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setComments(String str) {
        this.f2125to[4] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setCompany(String str) {
        this.f2125to[10] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setContentStatus(String str) {
        this.f2125to[6] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setContentType(String str) {
        this.f2125to[7] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setCreatedTime(Date date) {
        m1336k4(C14084qq.m67093k4(date));
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setCustomPropertyValue(String str, double d) {
        m1339k4(str, Double.valueOf(d));
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setHyperlinkBase(String str) {
        this.f2125to[14] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setKeywords(String str) {
        this.f2125to[3] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setLastPrinted(Date date) {
        m1343kk(C14084qq.m67093k4(date));
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setLastSavedBy(String str) {
        this.f2125to[8] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setLastSavedTime(Date date) {
        m1349x1(C14084qq.m67093k4(date));
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setManager(String str) {
        this.f2125to[11] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setNameOfApplication(String str) {
        this.f2125to[9] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setPresentationFormat(String str) {
        this.f2125to[12] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setRevisionNumber(int i) {
        this.f2126x1 = i;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setSharedDoc(boolean z) {
        this.f2121h4[0] = z;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setSubject(String str) {
        this.f2125to[1] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setTitle(String str) {
        this.f2125to[0] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setTotalEditingTime(double d) {
        m1335k4(C14077m4.m66794du(d));
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void set_Item(String str, Object obj) {
        if (!C7019kk.m27469x1(obj, Boolean.class) && !C7019kk.m27469x1(obj, Integer.class) && !C7019kk.m27469x1(obj, C14084qq.class) && !C7019kk.m27469x1(obj, String.class) && !C7019kk.m27469x1(obj, Float.class) && !C7019kk.m27469x1(obj, Double.class) && !C7019kk.m27469x1(obj, Date.class)) {
            throw new PptxEditException("Wrong value type of the custom property. The type can be bool, int, float, double, string and DateTime.");
        }
        this.f2122k4.set_Item(str, obj);
    }

    /* JADX INFO: renamed from: to */
    public C14084qq m1345to() {
        return this.f2120du[2];
    }

    /* JADX INFO: renamed from: x1 */
    public C14084qq m1347x1() {
        return this.f2120du[0];
    }

    public DocumentProperties(Presentation presentation) {
        this.f2122k4 = new SortedList<>(AbstractC14070jw.m66790x1());
        this.f2123kk = new C14077m4();
        if (presentation == null) {
            throw new ArgumentNullException("parent");
        }
        this.f2124m9 = presentation;
        m1331dy();
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void getCustomPropertyValue(String str, float[] fArr) {
        fArr[0] = ((Float) C7019kk.m27464to(m1348x1(str), Float.TYPE)).floatValue();
    }

    /* JADX INFO: renamed from: k4 */
    public void m1335k4(C14077m4 c14077m4) {
        c14077m4.CloneTo(this.f2123kk);
    }

    /* JADX INFO: renamed from: kk */
    public void m1343kk(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f2120du[2]);
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setCustomPropertyValue(String str, float f) {
        m1339k4(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: to */
    public final void m1346to(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f2120du[1]);
    }

    /* JADX INFO: renamed from: x1 */
    public final Object m1348x1(String str) {
        Object[] objArr = {null};
        this.f2122k4.tryGetValue(str, objArr);
        return objArr[0];
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void getCustomPropertyValue(String str, int[] iArr) {
        iArr[0] = ((Integer) C7019kk.m27464to(m1348x1(str), Integer.TYPE)).intValue();
    }

    /* JADX INFO: renamed from: k4 */
    public void m1336k4(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f2120du[0]);
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setCustomPropertyValue(String str, int i) {
        m1339k4(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x1 */
    public void m1349x1(C14084qq c14084qq) {
        if (C7019kk.m27469x1(this.f2124m9, Presentation.class)) {
            throw new InvalidOperationException(C14113y2.m67408k4("LastSavedTime can't be changed via Presentation.DocumentProperties property. ", "This property is internally updated while IPresentation object saving process. Please use the ", "instance of PresentationInfo class to change this value of an existing presentation. ", "Please see the example in IPresentationInfo.UpdateDocumentProperties method summary."));
        }
        m1346to(c14084qq.Clone());
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void getCustomPropertyValue(String str, String[] strArr) {
        strArr[0] = (String) m1348x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1337k4(String str) {
        this.f2125to[15] = str;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setCustomPropertyValue(String str, String str2) {
        m1339k4(str, str2);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1350x1(boolean z) {
        this.f2121h4[2] = z;
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void getCustomPropertyValue(String str, Date[] dateArr) {
        C14084qq[] c14084qqArr = {new C14084qq()};
        m1340k4(str, c14084qqArr);
        dateArr[0] = C14084qq.m67108kk(c14084qqArr[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public void m1338k4(String str, C14084qq c14084qq) {
        m1339k4(str, (Object) c14084qq.Clone());
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setCustomPropertyValue(String str, Date date) {
        m1338k4(str, C14084qq.m67093k4(date));
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void getCustomPropertyValue(String str, boolean[] zArr) {
        zArr[0] = ((Boolean) C7019kk.m27464to(m1348x1(str), Boolean.TYPE)).booleanValue();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1339k4(String str, Object obj) {
        if ((obj == null || !C7019kk.m27469x1(obj, Boolean.class)) && !C7019kk.m27469x1(obj, C14084qq.class) && !C7019kk.m27469x1(obj, String.class) && !C7019kk.m27469x1(obj, C14077m4.class) && !C7019kk.m27469x1(obj, Integer.class) && !C7019kk.m27469x1(obj, Float.class) && !C7019kk.m27469x1(obj, Double.class) && !C7019kk.m27469x1(obj, Date.class)) {
            throw new PptxEditException("Wrong value type of the custom property. The type can be bool, int, float, double, string, DateTime.");
        }
        this.f2122k4.set_Item(str, obj);
    }

    @Override // com.aspose.slides.IDocumentProperties
    public final void setCustomPropertyValue(String str, boolean z) {
        m1339k4(str, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: k4 */
    public void m1340k4(String str, C14084qq[] c14084qqArr) {
        ((C14084qq) C7019kk.m27464to(m1348x1(str), C14084qq.class)).CloneTo(c14084qqArr[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1341k4(boolean z) {
        this.f2121h4[1] = z;
    }
}
