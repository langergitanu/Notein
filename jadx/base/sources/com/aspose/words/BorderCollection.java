package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class BorderCollection implements Iterable<Border> {
    private zzZD6 zzZCq;

    public static final class zzZ implements Iterator<Border> {
        private int zzZCa = -1;
        private BorderCollection zzZCb;

        public zzZ(BorderCollection borderCollection) {
            this.zzZCb = borderCollection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zz8A, reason: merged with bridge method [inline-methods] */
        public Border next() {
            try {
                return this.zzZCb.get(this.zzZCa);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.zzZCa >= this.zzZCb.getCount() - 1) {
                return false;
            }
            this.zzZCa++;
            return true;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public BorderCollection(zzZD6 zzzd6) {
        this.zzZCq = zzzd6;
    }

    private com.aspose.words.internal.zzPV zz8Q() throws Exception {
        return get(0).zz8Q();
    }

    private static boolean zzON(int i) {
        return (i == 6 || i == 7) ? false : true;
    }

    private void zzm(com.aspose.words.internal.zzPV zzpv) throws Exception {
        Iterator<T> it = this.zzZCq.getPossibleBorderKeys().getKeys().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (zzON(iIntValue)) {
                getByBorderType(iIntValue).zzm(zzpv);
            }
        }
    }

    public final void clearFormatting() {
        Iterator<Border> it = iterator();
        while (it.hasNext()) {
            it.next().clearFormatting();
        }
    }

    public final boolean equals(BorderCollection borderCollection) throws Exception {
        if (com.aspose.words.internal.zzZKO.zzA(this, borderCollection)) {
            return true;
        }
        return getLeft().equals(borderCollection.getLeft()) && getRight().equals(borderCollection.getRight()) && getTop().equals(borderCollection.getTop()) && getBottom().equals(borderCollection.getBottom()) && getHorizontal().equals(borderCollection.getHorizontal()) && getVertical().equals(borderCollection.getVertical()) && getColor() == borderCollection.getColor() && zz8Q().equals(borderCollection.zz8Q()) && getDistanceFromText() == borderCollection.getDistanceFromText() && getLineWidth() == borderCollection.getLineWidth() && getLineStyle() == borderCollection.getLineStyle() && getCount() == borderCollection.getCount() && getShadow() == borderCollection.getShadow() && isVisible() == borderCollection.isVisible();
    }

    public final Border get(int i) throws Exception {
        return getByBorderType(this.zzZCq.getPossibleBorderKeys().getKeys().get(i).intValue());
    }

    public final Border getBottom() throws Exception {
        return getByBorderType(0);
    }

    public final Border getByBorderType(int i) throws Exception {
        RefInt refInt = new RefInt(0);
        boolean zZzZ = this.zzZCq.getPossibleBorderKeys().zzZ(Integer.valueOf(i), refInt);
        int i2 = refInt.get();
        if (!zZzZ) {
            throw new IllegalStateException("The requested border is not available for this object.");
        }
        Border border = (Border) this.zzZCq.getDirectBorderAttr(i2);
        if (border != null) {
            return border;
        }
        Border border2 = new Border(this.zzZCq, i2);
        this.zzZCq.setBorderAttr(i2, border2);
        return border2;
    }

    public final int getColor() throws Exception {
        return zz8Q().zzPG();
    }

    public final int getCount() {
        return this.zzZCq.getPossibleBorderKeys().getCount();
    }

    public final double getDistanceFromText() throws Exception {
        return get(0).getDistanceFromText();
    }

    public final Border getHorizontal() throws Exception {
        return getByBorderType(4);
    }

    public final Border getLeft() throws Exception {
        return getByBorderType(1);
    }

    public final int getLineStyle() throws Exception {
        return get(0).getLineStyle();
    }

    public final double getLineWidth() throws Exception {
        return get(0).getLineWidth();
    }

    public final Border getRight() throws Exception {
        return getByBorderType(2);
    }

    public final boolean getShadow() throws Exception {
        return get(0).getShadow();
    }

    public final Border getTop() throws Exception {
        return getByBorderType(3);
    }

    public final Border getVertical() throws Exception {
        return getByBorderType(5);
    }

    public final boolean isVisible() {
        Iterator<Border> it = iterator();
        while (it.hasNext()) {
            if (it.next().isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<Border> iterator() {
        return new zzZ(this);
    }

    public final void setColor(int i) throws Exception {
        zzm(com.aspose.words.internal.zzPV.zzYR(i));
    }

    public final void setDistanceFromText(double d) throws Exception {
        Iterator<T> it = this.zzZCq.getPossibleBorderKeys().getKeys().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (zzON(iIntValue)) {
                getByBorderType(iIntValue).setDistanceFromText(d);
            }
        }
    }

    public final void setLineStyle(int i) throws Exception {
        Iterator<T> it = this.zzZCq.getPossibleBorderKeys().getKeys().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (zzON(iIntValue)) {
                getByBorderType(iIntValue).setLineStyle(i);
            }
        }
    }

    public final void setLineWidth(double d) throws Exception {
        Iterator<T> it = this.zzZCq.getPossibleBorderKeys().getKeys().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (zzON(iIntValue)) {
                getByBorderType(iIntValue).setLineWidth(d);
            }
        }
    }

    public final void setShadow(boolean z) throws Exception {
        Iterator<T> it = this.zzZCq.getPossibleBorderKeys().getKeys().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (zzON(iIntValue)) {
                getByBorderType(iIntValue).setShadow(z);
            }
        }
    }

    public final boolean zzOO(int i) {
        return this.zzZCq.getPossibleBorderKeys().containsKey(Integer.valueOf(i));
    }
}
