package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.transition.OooOOO0;
import com.aspose.slides.C22226Oooo0oo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.transition.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C22105OooOo0 extends OooOOO0 {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f66388OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList<OooOOO0> f66386OooOo0o = new ArrayList<>();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f66385OooOo = true;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f66387OooOoO = false;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f66389OooOoOO = 0;

    /* JADX INFO: renamed from: androidx.transition.OooOo0$OooO00o */
    public class OooO00o extends C22103OooOOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f66390OooO00o;

        public OooO00o(OooOOO0 oooOOO0) {
            this.f66390OooO00o = oooOOO0;
        }

        @Override // androidx.transition.C22103OooOOo0, androidx.transition.OooOOO0.OooO
        public final void onTransitionEnd(OooOOO0 oooOOO0) {
            this.f66390OooO00o.runAnimators();
            oooOOO0.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.OooOo0$OooO0O0 */
    public class OooO0O0 extends C22103OooOOo0 {
        public OooO0O0() {
        }

        @Override // androidx.transition.C22103OooOOo0, androidx.transition.OooOOO0.OooO
        public final void onTransitionCancel(OooOOO0 oooOOO0) {
            C22105OooOo0 c22105OooOo0 = C22105OooOo0.this;
            c22105OooOo0.f66386OooOo0o.remove(oooOOO0);
            if (c22105OooOo0.hasAnimators()) {
                return;
            }
            c22105OooOo0.notifyListeners(OooOOO0.OooOO0.f66371OooO0OO, false);
            c22105OooOo0.mEnded = true;
            c22105OooOo0.notifyListeners(OooOOO0.OooOO0.f66370OooO0O0, false);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.OooOo0$OooO0OO */
    public static class OooO0OO extends C22103OooOOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C22105OooOo0 f66392OooO00o;

        @Override // androidx.transition.C22103OooOOo0, androidx.transition.OooOOO0.OooO
        public final void onTransitionEnd(OooOOO0 oooOOO0) {
            C22105OooOo0 c22105OooOo0 = this.f66392OooO00o;
            int i = c22105OooOo0.f66388OooOoO0 - 1;
            c22105OooOo0.f66388OooOoO0 = i;
            if (i == 0) {
                c22105OooOo0.f66387OooOoO = false;
                c22105OooOo0.end();
            }
            oooOOO0.removeListener(this);
        }

        @Override // androidx.transition.C22103OooOOo0, androidx.transition.OooOOO0.OooO
        public final void onTransitionStart(OooOOO0 oooOOO0) {
            C22105OooOo0 c22105OooOo0 = this.f66392OooO00o;
            if (c22105OooOo0.f66387OooOoO) {
                return;
            }
            c22105OooOo0.start();
            c22105OooOo0.f66387OooOoO = true;
        }
    }

    public final void OooO00o(OooOOO0 oooOOO0) {
        this.f66386OooOo0o.add(oooOOO0);
        oooOOO0.mParent = this;
        long j = this.mDuration;
        if (j >= 0) {
            oooOOO0.setDuration(j);
        }
        if ((this.f66389OooOoOO & 1) != 0) {
            oooOOO0.setInterpolator(getInterpolator());
        }
        if ((this.f66389OooOoOO & 2) != 0) {
            getPropagation();
            oooOOO0.setPropagation(null);
        }
        if ((this.f66389OooOoOO & 4) != 0) {
            oooOOO0.setPathMotion(getPathMotion());
        }
        if ((this.f66389OooOoOO & 8) != 0) {
            oooOOO0.setEpicenterCallback(getEpicenterCallback());
        }
    }

    public final OooOOO0 OooO0O0(int i) {
        if (i < 0 || i >= this.f66386OooOo0o.size()) {
            return null;
        }
        return this.f66386OooOo0o.get(i);
    }

    public final void OooO0OO(OooOOO0 oooOOO0) {
        this.f66386OooOo0o.remove(oooOOO0);
        oooOOO0.mParent = null;
    }

    public final void OooO0Oo(long j) {
        ArrayList<OooOOO0> arrayList;
        super.setDuration(j);
        if (this.mDuration < 0 || (arrayList = this.f66386OooOo0o) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f66386OooOo0o.get(i).setDuration(j);
        }
    }

    public final void OooO0o(int i) {
        if (i == 0) {
            this.f66385OooOo = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(C21532OooOOo.OooO0OO(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f66385OooOo = false;
        }
    }

    @Override // androidx.transition.OooOOO0
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final C22105OooOo0 setInterpolator(TimeInterpolator timeInterpolator) {
        this.f66389OooOoOO |= 1;
        ArrayList<OooOOO0> arrayList = this.f66386OooOo0o;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f66386OooOo0o.get(i).setInterpolator(timeInterpolator);
            }
        }
        return (C22105OooOo0) super.setInterpolator(timeInterpolator);
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 addListener(OooOOO0.OooO oooO) {
        return (C22105OooOo0) super.addListener(oooO);
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 addTarget(View view) {
        for (int i = 0; i < this.f66386OooOo0o.size(); i++) {
            this.f66386OooOo0o.get(i).addTarget(view);
        }
        return (C22105OooOo0) super.addTarget(view);
    }

    @Override // androidx.transition.OooOOO0
    public final void cancel() {
        super.cancel();
        int size = this.f66386OooOo0o.size();
        for (int i = 0; i < size; i++) {
            this.f66386OooOo0o.get(i).cancel();
        }
    }

    @Override // androidx.transition.OooOOO0
    public final void captureEndValues(C22107OooOo0o c22107OooOo0o) {
        if (isValidTarget(c22107OooOo0o.f66395OooO0O0)) {
            for (OooOOO0 oooOOO0 : this.f66386OooOo0o) {
                if (oooOOO0.isValidTarget(c22107OooOo0o.f66395OooO0O0)) {
                    oooOOO0.captureEndValues(c22107OooOo0o);
                    c22107OooOo0o.f66396OooO0OO.add(oooOOO0);
                }
            }
        }
    }

    @Override // androidx.transition.OooOOO0
    public final void capturePropagationValues(C22107OooOo0o c22107OooOo0o) {
        super.capturePropagationValues(c22107OooOo0o);
        int size = this.f66386OooOo0o.size();
        for (int i = 0; i < size; i++) {
            this.f66386OooOo0o.get(i).capturePropagationValues(c22107OooOo0o);
        }
    }

    @Override // androidx.transition.OooOOO0
    public final void captureStartValues(C22107OooOo0o c22107OooOo0o) {
        if (isValidTarget(c22107OooOo0o.f66395OooO0O0)) {
            for (OooOOO0 oooOOO0 : this.f66386OooOo0o) {
                if (oooOOO0.isValidTarget(c22107OooOo0o.f66395OooO0O0)) {
                    oooOOO0.captureStartValues(c22107OooOo0o);
                    c22107OooOo0o.f66396OooO0OO.add(oooOOO0);
                }
            }
        }
    }

    @Override // androidx.transition.OooOOO0
    public final void createAnimators(ViewGroup viewGroup, OooOo oooOo, OooOo oooOo2, ArrayList<C22107OooOo0o> arrayList, ArrayList<C22107OooOo0o> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f66386OooOo0o.size();
        for (int i = 0; i < size; i++) {
            OooOOO0 oooOOO0 = this.f66386OooOo0o.get(i);
            if (startDelay > 0 && (this.f66385OooOo || i == 0)) {
                long startDelay2 = oooOOO0.getStartDelay();
                if (startDelay2 > 0) {
                    oooOOO0.setStartDelay(startDelay2 + startDelay);
                } else {
                    oooOOO0.setStartDelay(startDelay);
                }
            }
            oooOOO0.createAnimators(viewGroup, oooOo, oooOo2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 excludeTarget(View view, boolean z) {
        for (int i = 0; i < this.f66386OooOo0o.size(); i++) {
            this.f66386OooOo0o.get(i).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @Override // androidx.transition.OooOOO0
    public final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f66386OooOo0o.size();
        for (int i = 0; i < size; i++) {
            this.f66386OooOo0o.get(i).forceToEnd(viewGroup);
        }
    }

    @Override // androidx.transition.OooOOO0
    public final boolean hasAnimators() {
        for (int i = 0; i < this.f66386OooOo0o.size(); i++) {
            if (this.f66386OooOo0o.get(i).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.OooOOO0
    public final boolean isSeekingSupported() {
        int size = this.f66386OooOo0o.size();
        for (int i = 0; i < size; i++) {
            if (!this.f66386OooOo0o.get(i).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.OooOOO0
    public final void pause(View view) {
        super.pause(view);
        int size = this.f66386OooOo0o.size();
        for (int i = 0; i < size; i++) {
            this.f66386OooOo0o.get(i).pause(view);
        }
    }

    @Override // androidx.transition.OooOOO0
    public final void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        OooO0O0 oooO0O0 = new OooO0O0();
        for (int i = 0; i < this.f66386OooOo0o.size(); i++) {
            OooOOO0 oooOOO0 = this.f66386OooOo0o.get(i);
            oooOOO0.addListener(oooO0O0);
            oooOOO0.prepareAnimatorsForSeeking();
            long totalDurationMillis = oooOOO0.getTotalDurationMillis();
            if (this.f66385OooOo) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                long j = this.mTotalDuration;
                oooOOO0.mSeekOffsetInParent = j;
                this.mTotalDuration = j + totalDurationMillis;
            }
        }
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 removeListener(OooOOO0.OooO oooO) {
        return (C22105OooOo0) super.removeListener(oooO);
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 removeTarget(int i) {
        for (int i2 = 0; i2 < this.f66386OooOo0o.size(); i2++) {
            this.f66386OooOo0o.get(i2).removeTarget(i);
        }
        return (C22105OooOo0) super.removeTarget(i);
    }

    @Override // androidx.transition.OooOOO0
    public final void resume(View view) {
        super.resume(view);
        int size = this.f66386OooOo0o.size();
        for (int i = 0; i < size; i++) {
            this.f66386OooOo0o.get(i).resume(view);
        }
    }

    @Override // androidx.transition.OooOOO0
    public final void runAnimators() {
        if (this.f66386OooOo0o.isEmpty()) {
            start();
            end();
            return;
        }
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f66392OooO00o = this;
        Iterator<OooOOO0> it = this.f66386OooOo0o.iterator();
        while (it.hasNext()) {
            it.next().addListener(oooO0OO);
        }
        this.f66388OooOoO0 = this.f66386OooOo0o.size();
        if (this.f66385OooOo) {
            Iterator<OooOOO0> it2 = this.f66386OooOo0o.iterator();
            while (it2.hasNext()) {
                it2.next().runAnimators();
            }
            return;
        }
        for (int i = 1; i < this.f66386OooOo0o.size(); i++) {
            this.f66386OooOo0o.get(i - 1).addListener(new OooO00o(this.f66386OooOo0o.get(i)));
        }
        OooOOO0 oooOOO0 = this.f66386OooOo0o.get(0);
        if (oooOOO0 != null) {
            oooOOO0.runAnimators();
        }
    }

    @Override // androidx.transition.OooOOO0
    public final void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.f66386OooOo0o.size();
        for (int i = 0; i < size; i++) {
            this.f66386OooOo0o.get(i).setCanRemoveViews(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.OooOOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCurrentPlayTimeMillis(long j, long j2) {
        long j3;
        long totalDurationMillis = getTotalDurationMillis();
        long j4 = 0;
        if (this.mParent != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > totalDurationMillis && j2 > totalDurationMillis) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= totalDurationMillis && j2 > totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(OooOOO0.OooOO0.f66369OooO00o, z);
        }
        if (!this.f66385OooOo) {
            int size = 1;
            while (true) {
                if (size >= this.f66386OooOo0o.size()) {
                    size = this.f66386OooOo0o.size();
                    break;
                } else if (this.f66386OooOo0o.get(size).mSeekOffsetInParent > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (i < this.f66386OooOo0o.size()) {
                    OooOOO0 oooOOO0 = this.f66386OooOo0o.get(i);
                    long j5 = oooOOO0.mSeekOffsetInParent;
                    j3 = j4;
                    long j6 = j - j5;
                    if (j6 < j3) {
                        break;
                    }
                    oooOOO0.setCurrentPlayTimeMillis(j6, j2 - j5);
                    i++;
                    j4 = j3;
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    OooOOO0 oooOOO02 = this.f66386OooOo0o.get(i);
                    long j7 = oooOOO02.mSeekOffsetInParent;
                    long j8 = j - j7;
                    oooOOO02.setCurrentPlayTimeMillis(j8, j2 - j7);
                    if (j8 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.mParent == null) {
                if ((j <= totalDurationMillis || j2 > totalDurationMillis) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > totalDurationMillis) {
                    this.mEnded = true;
                }
                notifyListeners(OooOOO0.OooOO0.f66370OooO0O0, z);
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < this.f66386OooOo0o.size(); i2++) {
            this.f66386OooOo0o.get(i2).setCurrentPlayTimeMillis(j, j2);
        }
        j3 = j4;
        if (this.mParent == null) {
        }
    }

    @Override // androidx.transition.OooOOO0
    public final /* bridge */ /* synthetic */ OooOOO0 setDuration(long j) {
        OooO0Oo(j);
        return this;
    }

    @Override // androidx.transition.OooOOO0
    public final void setEpicenterCallback(OooOOO0.OooO0o oooO0o) {
        super.setEpicenterCallback(oooO0o);
        this.f66389OooOoOO |= 8;
        int size = this.f66386OooOo0o.size();
        for (int i = 0; i < size; i++) {
            this.f66386OooOo0o.get(i).setEpicenterCallback(oooO0o);
        }
    }

    @Override // androidx.transition.OooOOO0
    public final void setPathMotion(OooO oooO) {
        super.setPathMotion(oooO);
        this.f66389OooOoOO |= 4;
        if (this.f66386OooOo0o != null) {
            for (int i = 0; i < this.f66386OooOo0o.size(); i++) {
                this.f66386OooOo0o.get(i).setPathMotion(oooO);
            }
        }
    }

    @Override // androidx.transition.OooOOO0
    public final void setPropagation(AbstractC22104OooOOoo abstractC22104OooOOoo) {
        super.setPropagation(null);
        this.f66389OooOoOO |= 2;
        int size = this.f66386OooOo0o.size();
        for (int i = 0; i < size; i++) {
            this.f66386OooOo0o.get(i).setPropagation(null);
        }
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 setStartDelay(long j) {
        return (C22105OooOo0) super.setStartDelay(j);
    }

    @Override // androidx.transition.OooOOO0
    public final String toString(String str) {
        String string = super.toString(str);
        for (int i = 0; i < this.f66386OooOo0o.size(); i++) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(string, IOUtils.LINE_SEPARATOR_UNIX);
            sbOooO0OO.append(this.f66386OooOo0o.get(i).toString(str + "  "));
            string = sbOooO0OO.toString();
        }
        return string;
    }

    @Override // androidx.transition.OooOOO0
    /* JADX INFO: renamed from: clone */
    public final OooOOO0 mo80680clone() {
        C22105OooOo0 c22105OooOo0 = (C22105OooOo0) super.mo80680clone();
        c22105OooOo0.f66386OooOo0o = new ArrayList<>();
        int size = this.f66386OooOo0o.size();
        for (int i = 0; i < size; i++) {
            OooOOO0 oooOOO0Mo80680clone = this.f66386OooOo0o.get(i).mo80680clone();
            c22105OooOo0.f66386OooOo0o.add(oooOOO0Mo80680clone);
            oooOOO0Mo80680clone.mParent = c22105OooOo0;
        }
        return c22105OooOo0;
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 addTarget(int i) {
        for (int i2 = 0; i2 < this.f66386OooOo0o.size(); i2++) {
            this.f66386OooOo0o.get(i2).addTarget(i);
        }
        return (C22105OooOo0) super.addTarget(i);
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 excludeTarget(String str, boolean z) {
        for (int i = 0; i < this.f66386OooOo0o.size(); i++) {
            this.f66386OooOo0o.get(i).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 removeTarget(View view) {
        for (int i = 0; i < this.f66386OooOo0o.size(); i++) {
            this.f66386OooOo0o.get(i).removeTarget(view);
        }
        return (C22105OooOo0) super.removeTarget(view);
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 addTarget(String str) {
        for (int i = 0; i < this.f66386OooOo0o.size(); i++) {
            this.f66386OooOo0o.get(i).addTarget(str);
        }
        return (C22105OooOo0) super.addTarget(str);
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.f66386OooOo0o.size(); i2++) {
            this.f66386OooOo0o.get(i2).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 removeTarget(Class cls) {
        for (int i = 0; i < this.f66386OooOo0o.size(); i++) {
            this.f66386OooOo0o.get(i).removeTarget((Class<?>) cls);
        }
        return (C22105OooOo0) super.removeTarget((Class<?>) cls);
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 addTarget(Class cls) {
        for (int i = 0; i < this.f66386OooOo0o.size(); i++) {
            this.f66386OooOo0o.get(i).addTarget((Class<?>) cls);
        }
        return (C22105OooOo0) super.addTarget((Class<?>) cls);
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 excludeTarget(Class<?> cls, boolean z) {
        for (int i = 0; i < this.f66386OooOo0o.size(); i++) {
            this.f66386OooOo0o.get(i).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }

    @Override // androidx.transition.OooOOO0
    public final OooOOO0 removeTarget(String str) {
        for (int i = 0; i < this.f66386OooOo0o.size(); i++) {
            this.f66386OooOo0o.get(i).removeTarget(str);
        }
        return (C22105OooOo0) super.removeTarget(str);
    }
}
