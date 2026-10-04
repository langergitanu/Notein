package o000O0o;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f82394OooO00o;

    public static class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f82395OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C24404OooO0Oo f82396OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f82397OooO0OO = true;

        public OooO00o(TextView textView) {
            this.f82395OooO00o = textView;
            this.f82396OooO0O0 = new C24404OooO0Oo(textView);
        }

        @Override // o000O0o.OooO0o.OooO0O0
        public final InputFilter[] OooO00o(InputFilter[] inputFilterArr) {
            if (!this.f82397OooO0OO) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    InputFilter inputFilter = inputFilterArr[i];
                    if (inputFilter instanceof C24404OooO0Oo) {
                        sparseArray.put(i, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i4 = 0;
            while (true) {
                C24404OooO0Oo c24404OooO0Oo = this.f82396OooO0O0;
                if (i4 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = c24404OooO0Oo;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i4] == c24404OooO0Oo) {
                    return inputFilterArr;
                }
                i4++;
            }
        }

        @Override // o000O0o.OooO0o.OooO0O0
        public final boolean OooO0O0() {
            return this.f82397OooO0OO;
        }

        @Override // o000O0o.OooO0o.OooO0O0
        public final void OooO0OO(boolean z) {
            if (z) {
                TextView textView = this.f82395OooO00o;
                textView.setTransformationMethod(OooO0o0(textView.getTransformationMethod()));
            }
        }

        @Override // o000O0o.OooO0o.OooO0O0
        public final void OooO0Oo(boolean z) {
            this.f82397OooO0OO = z;
            TextView textView = this.f82395OooO00o;
            textView.setTransformationMethod(OooO0o0(textView.getTransformationMethod()));
            textView.setFilters(OooO00o(textView.getFilters()));
        }

        @Override // o000O0o.OooO0o.OooO0O0
        public final TransformationMethod OooO0o0(TransformationMethod transformationMethod) {
            return this.f82397OooO0OO ? ((transformationMethod instanceof C24407OooO0oo) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C24407OooO0oo(transformationMethod) : transformationMethod instanceof C24407OooO0oo ? ((C24407OooO0oo) transformationMethod).f82405OooO00o : transformationMethod;
        }
    }

    public static class OooO0O0 {
        public InputFilter[] OooO00o(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean OooO0O0() {
            throw null;
        }

        public void OooO0OO(boolean z) {
            throw null;
        }

        public void OooO0Oo(boolean z) {
            throw null;
        }

        public TransformationMethod OooO0o0(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    public static class OooO0OO extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f82398OooO00o;

        public OooO0OO(TextView textView) {
            this.f82398OooO00o = new OooO00o(textView);
        }

        @Override // o000O0o.OooO0o.OooO0O0
        public final InputFilter[] OooO00o(InputFilter[] inputFilterArr) {
            return !androidx.emoji2.text.OooO0OO.OooO0OO() ? inputFilterArr : this.f82398OooO00o.OooO00o(inputFilterArr);
        }

        @Override // o000O0o.OooO0o.OooO0O0
        public final boolean OooO0O0() {
            return this.f82398OooO00o.f82397OooO0OO;
        }

        @Override // o000O0o.OooO0o.OooO0O0
        public final void OooO0OO(boolean z) {
            if (androidx.emoji2.text.OooO0OO.OooO0OO()) {
                this.f82398OooO00o.OooO0OO(z);
            }
        }

        @Override // o000O0o.OooO0o.OooO0O0
        public final void OooO0Oo(boolean z) {
            boolean zOooO0OO = androidx.emoji2.text.OooO0OO.OooO0OO();
            OooO00o oooO00o = this.f82398OooO00o;
            if (zOooO0OO) {
                oooO00o.OooO0Oo(z);
            } else {
                oooO00o.f82397OooO0OO = z;
            }
        }

        @Override // o000O0o.OooO0o.OooO0O0
        public final TransformationMethod OooO0o0(TransformationMethod transformationMethod) {
            return !androidx.emoji2.text.OooO0OO.OooO0OO() ? transformationMethod : this.f82398OooO00o.OooO0o0(transformationMethod);
        }
    }

    public OooO0o(TextView textView) {
        Preconditions.checkNotNull(textView, "textView cannot be null");
        this.f82394OooO00o = new OooO0OO(textView);
    }
}
