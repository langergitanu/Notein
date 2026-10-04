package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSlideHeaderFooterManager extends BaseHeaderFooterManager {

    /* JADX INFO: renamed from: k4 */
    private final BaseSlide f1087k4;

    public BaseSlideHeaderFooterManager(BaseSlide baseSlide) {
        super(baseSlide.m403rv());
        this.f1087k4 = baseSlide;
    }

    /* JADX INFO: renamed from: du */
    private String m410du(byte b) {
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) this.f1087k4.m391k4(b), AutoShape.class);
        if (autoShape == null || autoShape.getTextFrame() == null) {
            return null;
        }
        return autoShape.getTextFrame().getText();
    }

    public final boolean isDateTimeVisible() {
        return m422x1((byte) 4);
    }

    public final boolean isFooterVisible() {
        return m422x1((byte) 6);
    }

    public final boolean isSlideNumberVisible() {
        return m422x1((byte) 5);
    }

    /* JADX INFO: renamed from: k4 */
    public final BaseSlide m412k4() {
        return this.f1087k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m416kk() {
        return m410du((byte) 4);
    }

    /* JADX INFO: renamed from: kk */
    public abstract void mo417kk(byte b);

    public final void setDateTimeText(String str) {
        m413k4((byte) 4, str, true);
    }

    public final void setDateTimeVisibility(boolean z) {
        m414k4((byte) 4, z);
    }

    public final void setFooterText(String str) {
        m413k4((byte) 6, str, false);
    }

    public final void setFooterVisibility(boolean z) {
        m414k4((byte) 6, z);
    }

    public final void setSlideNumberVisibility(boolean z) {
        m414k4((byte) 5, z);
    }

    /* JADX INFO: renamed from: to */
    public final void m418to() {
        for (int size = m412k4().getShapes().size() - 1; size >= 0; size--) {
            IShape iShape = m412k4().getShapes().get_Item(size);
            if (iShape.getPlaceholder() != null && (iShape.getPlaceholder().getIndex() & 4294967295L) != 4294967295L) {
                ((Placeholder) iShape.getPlaceholder()).m2270k4(4294967295L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final void m420x1(BaseSlide baseSlide) {
        boolean z;
        Dictionary dictionary = new Dictionary();
        List list = new List();
        IGenericEnumerator<IShape> it = baseSlide.getShapes().iterator();
        while (it.hasNext()) {
            try {
                IPlaceholder placeholder = ((Shape) it.next()).getPlaceholder();
                if (placeholder != null && (placeholder.getIndex() & 4294967295L) != 4294967295L) {
                    dictionary.addItem(Long.valueOf(placeholder.getIndex()), Byte.valueOf(placeholder.getType()));
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
        it = m412k4().getShapes().iterator();
        while (it.hasNext()) {
            try {
                IPlaceholder placeholder2 = ((Shape) it.next()).getPlaceholder();
                if (placeholder2 != null && (placeholder2.getIndex() & 4294967295L) != 4294967295L) {
                    if (dictionary.containsKey(Long.valueOf(placeholder2.getIndex())) && placeholder2.getType() == ((Byte) dictionary.get_Item(Long.valueOf(placeholder2.getIndex()))).byteValue()) {
                        dictionary.removeItemByKey(Long.valueOf(placeholder2.getIndex()));
                    } else if (placeholder2.getType() != 8) {
                        list.addItem(placeholder2);
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                Placeholder placeholder3 = (Placeholder) it2.next();
                Dictionary.Enumerator it3 = dictionary.iterator();
                while (true) {
                    try {
                        if (!it3.hasNext()) {
                            z = false;
                            break;
                        }
                        KeyValuePair next = it3.next();
                        if (((Byte) next.getValue()).byteValue() == placeholder3.getType()) {
                            if (!m411k4(placeholder3.getType()) || (placeholder3.getIndex() & 4294967295L) < 10) {
                                placeholder3.m2270k4(((Long) next.getKey()).longValue());
                            }
                            dictionary.removeItemByKey(next.getKey());
                            z = true;
                        }
                    } catch (Throwable th2) {
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                        throw th2;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                if (!z) {
                    placeholder3.m2270k4(4294967295L);
                }
            } catch (Throwable th3) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th3;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m413k4(byte b, String str, boolean z) {
        IGenericEnumerator<IShape> it = m412k4().getShapes().iterator();
        while (it.hasNext()) {
            try {
                AutoShape autoShape = (AutoShape) C7019kk.m27452k4(it.next(), AutoShape.class);
                if (autoShape != null && autoShape.getPlaceholder() != null && autoShape.getPlaceholder().getType() == b) {
                    ITextFrame iTextFrameAddTextFrame = autoShape.addTextFrame(str);
                    if (z) {
                        iTextFrameAddTextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).removeField();
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m419to(byte b) {
        BaseHeaderFooterManager.m343k4(m412k4(), b);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m421x1() {
        if (((AutoShape) C7019kk.m27452k4((Object) this.f1087k4.m391k4((byte) 4), AutoShape.class)) != null) {
            return !r0.m285kk();
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m414k4(byte b, boolean z) {
        if (!z) {
            m419to(b);
        } else {
            if (m422x1(b)) {
                return;
            }
            mo417kk(b);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m422x1(byte b) {
        return this.f1087k4.m391k4(b) != null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m415k4(String str) {
        IGenericEnumerator<IShape> it = m412k4().getShapes().iterator();
        while (it.hasNext()) {
            try {
                AutoShape autoShape = (AutoShape) C7019kk.m27452k4(it.next(), AutoShape.class);
                if (autoShape != null && autoShape.getPlaceholder() != null && autoShape.getPlaceholder().getType() == 5) {
                    autoShape.addTextFrame(str).getParagraphs().get_Item(0).getPortions().get_Item(0).addField(FieldType.getSlideNumber());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m411k4(byte b) {
        return b == 4 || b == 5 || b == 6 || b == 7;
    }
}
