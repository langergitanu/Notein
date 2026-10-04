package com.aspose.slides;

import OooOoO.C20503OooO00o;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14074ks;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class vx6 {
    /* JADX INFO: renamed from: k4 */
    public static void m72570k4(int i, boolean z, List<IShape> list) {
        if (list.size() == 0) {
            return;
        }
        IBaseSlide slide = list.get_Item(0).getSlide();
        if (slide == null) {
            throw new InvalidOperationException("Parent slide for the shape is not defined.");
        }
        float width = 0.0f;
        float x = z ? 0.0f : list.get_Item(0).getX();
        float y = z ? 0.0f : list.get_Item(0).getY();
        float fM56699x1 = z ? ((SlideSize) slide.getPresentation().getSlideSize()).m2755k4().m56699x1() : list.get_Item(0).getX() + list.get_Item(0).getWidth();
        float fM56697kk = z ? ((SlideSize) slide.getPresentation().getSlideSize()).m2755k4().m56697kk() : list.get_Item(0).getHeight() + list.get_Item(0).getY();
        List.Enumerator<IShape> it = list.iterator();
        float x2 = fM56699x1;
        float y2 = y;
        float x3 = x;
        float height = 0.0f;
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                if (next.getSlide() != slide) {
                    throw new InvalidOperationException("Shapes must be placed on the same slide.");
                }
                if (!z) {
                    if (next.getX() < x3) {
                        x3 = next.getX();
                    }
                    if (next.getY() < y2) {
                        y2 = next.getY();
                    }
                    if (next.getX() + next.getWidth() > x2) {
                        x2 = next.getX() + next.getWidth();
                    }
                    if (next.getY() + next.getHeight() > fM56697kk) {
                        fM56697kk = next.getY() + next.getHeight();
                    }
                }
                height += next.getHeight();
                width += next.getWidth();
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        switch (i) {
            case 0:
                m72571k4(list, x3);
                return;
            case 1:
                m72576x1(list, x2);
                return;
            case 2:
                m72572k4(list, x3, x2);
                return;
            case 3:
                m72574kk(list, y2);
                return;
            case 4:
                m72577x1(list, y2, fM56697kk);
                return;
            case 5:
                m72575to(list, fM56697kk);
                return;
            case 6:
                m72573k4(list, z, width);
                return;
            case 7:
                m72578x1(list, z, height);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: kk */
    private static void m72574kk(List<IShape> list, float f) {
        List.Enumerator<IShape> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().setY(f);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private static void m72575to(List<IShape> list, float f) {
        List.Enumerator<IShape> it = list.iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                next.setY(f - next.getHeight());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m72576x1(List<IShape> list, float f) {
        List.Enumerator<IShape> it = list.iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                next.setX(f - next.getWidth());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72571k4(List<IShape> list, float f) {
        List.Enumerator<IShape> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().setX(f);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m72577x1(List<IShape> list, float f, float f2) {
        float fOooO0O0 = C20503OooO00o.OooO0O0(f2, f, 2.0f, f);
        List.Enumerator<IShape> it = list.iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                next.setY(fOooO0O0 - (next.getHeight() / 2.0f));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72572k4(List<IShape> list, float f, float f2) {
        float fOooO0O0 = C20503OooO00o.OooO0O0(f2, f, 2.0f, f);
        List.Enumerator<IShape> it = list.iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                next.setX(fOooO0O0 - (next.getWidth() / 2.0f));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m72578x1(List<IShape> list, boolean z, float f) {
        boolean zM27456k4;
        list.sort(new AbstractC14074ks<IShape>() { // from class: com.aspose.slides.vx6.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14074ks
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public int mo1193k4(IShape iShape, IShape iShape2) {
                float height = (iShape.getHeight() / 2.0f) + iShape.getY();
                float height2 = (iShape2.getHeight() / 2.0f) + iShape2.getY();
                if (height < height2) {
                    return -1;
                }
                return height > height2 ? 1 : 0;
            }
        });
        if (z) {
            float fM56697kk = (((SlideSize) list.get_Item(0).getSlide().getPresentation().getSlideSize()).m2755k4().m56697kk() - f) / (list.size() + 1);
            List.Enumerator<IShape> it = list.iterator();
            float height = fM56697kk;
            while (it.hasNext()) {
                try {
                    IShape next = it.next();
                    next.setY(height);
                    height += next.getHeight() + fM56697kk;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return;
            } else {
                return;
            }
        }
        if (list.size() <= 2) {
            return;
        }
        float height2 = list.get_Item(0).getHeight() + list.get_Item(0).getY();
        float y = ((((IShape) OooO0O0.OooO00o(list, 1)).getY() - height2) - ((f - list.get_Item(0).getHeight()) - ((IShape) OooO0O0.OooO00o(list, 1)).getHeight())) / (list.size() - 1);
        float height3 = height2 + y;
        for (int i = 1; i < list.size() - 1; i++) {
            list.get_Item(i).setY(height3);
            height3 += list.get_Item(i).getHeight() + y;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72573k4(List<IShape> list, boolean z, float f) {
        boolean zM27456k4;
        list.sort(new AbstractC14074ks<IShape>() { // from class: com.aspose.slides.vx6.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14074ks
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public int mo1193k4(IShape iShape, IShape iShape2) {
                float width = (iShape.getWidth() / 2.0f) + iShape.getX();
                float width2 = (iShape2.getWidth() / 2.0f) + iShape2.getX();
                if (width < width2) {
                    return -1;
                }
                return width > width2 ? 1 : 0;
            }
        });
        if (z) {
            float fM56699x1 = (((SlideSize) list.get_Item(0).getSlide().getPresentation().getSlideSize()).m2755k4().m56699x1() - f) / (list.size() + 1);
            List.Enumerator<IShape> it = list.iterator();
            float width = fM56699x1;
            while (it.hasNext()) {
                try {
                    IShape next = it.next();
                    next.setX(width);
                    width += next.getWidth() + fM56699x1;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return;
            } else {
                return;
            }
        }
        if (list.size() <= 2) {
            return;
        }
        float width2 = list.get_Item(0).getWidth() + list.get_Item(0).getX();
        float x = ((((IShape) OooO0O0.OooO00o(list, 1)).getX() - width2) - ((f - list.get_Item(0).getWidth()) - ((IShape) OooO0O0.OooO00o(list, 1)).getWidth())) / (list.size() - 1);
        float width3 = width2 + x;
        for (int i = 1; i < list.size() - 1; i++) {
            list.get_Item(i).setX(width3);
            width3 += list.get_Item(i).getWidth() + x;
        }
    }
}
