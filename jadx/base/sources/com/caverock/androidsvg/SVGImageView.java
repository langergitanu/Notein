package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import o00o0OO0.C25328OooO;
import o00o0OO0.C25345OooO0o;
import o00o0OO0.C25396OooO0oo;

/* JADX INFO: loaded from: classes5.dex */
public class SVGImageView extends ImageView {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final Method f67221OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C25345OooO0o f67222OooOo0o;

    public class OooO00o extends AsyncTask<Integer, Integer, C25345OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f67223OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f67224OooO0O0;

        public OooO00o(Context context, int i) {
            this.f67223OooO00o = context;
            this.f67224OooO0O0 = i;
        }

        @Override // android.os.AsyncTask
        public final C25345OooO0o doInBackground(Integer[] numArr) {
            int i = this.f67224OooO0O0;
            try {
                Resources resources = this.f67223OooO00o.getResources();
                C25328OooO c25328OooO = new C25328OooO();
                InputStream inputStreamOpenRawResource = resources.openRawResource(i);
                try {
                    C25345OooO0o c25345OooO0oOooO0o = c25328OooO.OooO0o(inputStreamOpenRawResource);
                    try {
                        return c25345OooO0oOooO0o;
                    } catch (IOException unused) {
                        return c25345OooO0oOooO0o;
                    }
                } finally {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (C25396OooO0oo e) {
                Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", Integer.valueOf(i), e.getMessage()));
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(C25345OooO0o c25345OooO0o) {
            SVGImageView sVGImageView = SVGImageView.this;
            sVGImageView.f67222OooOo0o = c25345OooO0o;
            sVGImageView.OooO00o();
        }
    }

    public class OooO0O0 extends AsyncTask<InputStream, Integer, C25345OooO0o> {
        public OooO0O0() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r3v1, types: [o00o0OO0.OooO] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.io.InputStream[]] */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        public final C25345OooO0o doInBackground(InputStream[] inputStreamArr) {
            C25345OooO0o c25345OooO0oOooO0o;
            InputStream[] inputStreamArr2 = inputStreamArr;
            try {
                try {
                    c25345OooO0oOooO0o = new C25328OooO().OooO0o(inputStreamArr2[0]);
                    try {
                        return c25345OooO0oOooO0o;
                    } catch (IOException unused) {
                        return c25345OooO0oOooO0o;
                    }
                } finally {
                    try {
                        inputStreamArr2[0].close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (C25396OooO0oo e) {
                Log.e("SVGImageView", "Parse error loading URI: " + e.getMessage());
                try {
                    inputStreamArr2 = inputStreamArr2[0];
                    inputStreamArr2.close();
                } catch (IOException unused3) {
                }
                c25345OooO0oOooO0o = null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(C25345OooO0o c25345OooO0o) {
            SVGImageView sVGImageView = SVGImageView.this;
            sVGImageView.f67222OooOo0o = c25345OooO0o;
            sVGImageView.OooO00o();
        }
    }

    static {
        try {
            f67221OooOo = View.class.getMethod("setLayerType", Integer.TYPE, Paint.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    private void setFromString(String str) {
        try {
            this.f67222OooOo0o = new C25328OooO().OooO0o(new ByteArrayInputStream(str.getBytes()));
            OooO00o();
        } catch (C25396OooO0oo unused) {
            com.aspose.slides.internal.p407st.OooO00o.OooO0O0("Could not find SVG at: ", str, "SVGImageView");
        }
    }

    public final void OooO00o() {
        C25345OooO0o c25345OooO0o = this.f67222OooOo0o;
        if (c25345OooO0o == null) {
            return;
        }
        Picture pictureOooO0OO = c25345OooO0o.OooO0OO();
        Method method = f67221OooOo;
        if (method != null) {
            try {
                method.invoke(this, Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), null);
            } catch (Exception e) {
                Log.w("SVGImageView", "Unexpected failure calling setLayerType", e);
            }
        }
        setImageDrawable(new PictureDrawable(pictureOooO0OO));
    }

    public void setCSS(String str) {
        throw null;
    }

    public void setImageAsset(String str) {
        try {
            new OooO0O0().execute(getContext().getAssets().open(str));
        } catch (IOException unused) {
            com.aspose.slides.internal.p407st.OooO00o.OooO0O0("File not found: ", str, "SVGImageView");
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        new OooO00o(getContext(), i).execute(new Integer[0]);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        try {
            new OooO0O0().execute(getContext().getContentResolver().openInputStream(uri));
        } catch (FileNotFoundException unused) {
            Log.e("SVGImageView", "File not found: " + uri);
        }
    }

    public void setSVG(C25345OooO0o c25345OooO0o) {
        if (c25345OooO0o == null) {
            throw new IllegalArgumentException("Null value passed to setSVG()");
        }
        this.f67222OooOo0o = c25345OooO0o;
        OooO00o();
    }
}
