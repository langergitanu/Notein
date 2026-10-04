package com.google.firebase.inappmessaging.display.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.C22253OooOO0o;
import com.bumptech.glide.OooOOO0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o00OoooO.C25183OooOO0;
import o00OoooO.InterfaceC25184OooOO0o;
import o00OoooO.OooOOO0;
import o00o0.InterfaceC25205OooO0O0;
import o00o00oo.AbstractC25296OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
public class FiamImageLoader {
    private final OooOOO0 requestManager;
    private final Map<String, Set<AbstractC25296OooO0OO>> tags = new HashMap();

    public static abstract class Callback extends AbstractC25296OooO0OO<Drawable> {
        private ImageView imageView;

        private void setImage(Drawable drawable) {
            ImageView imageView = this.imageView;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }

        public abstract void onError(Exception exc);

        @Override // o00o00oo.InterfaceC25293OooO
        public void onLoadCleared(Drawable drawable) {
            Logging.logd("Downloading Image Cleared");
            setImage(drawable);
            onSuccess();
        }

        @Override // o00o00oo.AbstractC25296OooO0OO, o00o00oo.InterfaceC25293OooO
        public void onLoadFailed(Drawable drawable) {
            Logging.logd("Downloading Image Failed");
            setImage(drawable);
            onError(new Exception("Image loading failed!"));
        }

        @Override // o00o00oo.InterfaceC25293OooO
        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, InterfaceC25205OooO0O0 interfaceC25205OooO0O0) {
            onResourceReady((Drawable) obj, (InterfaceC25205OooO0O0<? super Drawable>) interfaceC25205OooO0O0);
        }

        public abstract void onSuccess();

        public void setImageView(ImageView imageView) {
            this.imageView = imageView;
        }

        public void onResourceReady(Drawable drawable, InterfaceC25205OooO0O0<? super Drawable> interfaceC25205OooO0O0) {
            Logging.logd("Downloading Image Success!!!");
            setImage(drawable);
            onSuccess();
        }
    }

    public class FiamImageRequestCreator {
        private final C22253OooOO0o<Drawable> requestBuilder;
        private String tag;
        private Callback target;

        public FiamImageRequestCreator(C22253OooOO0o<Drawable> c22253OooOO0o) {
            this.requestBuilder = c22253OooOO0o;
        }

        private void checkAndTag() {
            Set hashSet;
            if (this.target == null || TextUtils.isEmpty(this.tag)) {
                return;
            }
            synchronized (FiamImageLoader.this.tags) {
                try {
                    if (FiamImageLoader.this.tags.containsKey(this.tag)) {
                        hashSet = (Set) FiamImageLoader.this.tags.get(this.tag);
                    } else {
                        hashSet = new HashSet();
                        FiamImageLoader.this.tags.put(this.tag, hashSet);
                    }
                    if (!hashSet.contains(this.target)) {
                        hashSet.add(this.target);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public FiamImageRequestCreator addErrorListener(GlideErrorListener glideErrorListener) {
            this.requestBuilder.Oooo0o(glideErrorListener);
            return this;
        }

        public void into(ImageView imageView, Callback callback) {
            Logging.logd("Downloading Image Callback : " + callback);
            callback.setImageView(imageView);
            C22253OooOO0o<Drawable> c22253OooOO0o = this.requestBuilder;
            c22253OooOO0o.OoooO0O(callback, c22253OooOO0o);
            this.target = callback;
            checkAndTag();
        }

        public FiamImageRequestCreator placeholder(int i) {
            this.requestBuilder.OooOo0(i);
            Logging.logd("Downloading Image Placeholder : " + i);
            return this;
        }

        public FiamImageRequestCreator tag(Class cls) {
            this.tag = cls.getSimpleName();
            checkAndTag();
            return this;
        }
    }

    public FiamImageLoader(OooOOO0 oooOOO0) {
        this.requestManager = oooOOO0;
    }

    public void cancelTag(Class cls) {
        String simpleName = cls.getSimpleName();
        synchronized (simpleName) {
            try {
                if (this.tags.containsKey(simpleName)) {
                    for (AbstractC25296OooO0OO abstractC25296OooO0OO : this.tags.get(simpleName)) {
                        if (abstractC25296OooO0OO != null) {
                            this.requestManager.OooO0Oo(abstractC25296OooO0OO);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean containsTag(String str) {
        Map<String, Set<AbstractC25296OooO0OO>> map = this.tags;
        return map != null && map.containsKey(str) && this.tags.get(str) != null && this.tags.get(str).size() > 0;
    }

    public FiamImageRequestCreator load(String str) {
        Logging.logd("Starting Downloading Image : " + str);
        OooOOO0.OooO00o oooO00o = new OooOOO0.OooO00o();
        OooOOO0.OooO0O0 oooO0O0 = new OooOOO0.OooO0O0("image/*");
        HashMap map = new HashMap(oooO00o.f85727OooO00o.size());
        for (Map.Entry<String, List<InterfaceC25184OooOO0o>> entry : oooO00o.f85727OooO00o.entrySet()) {
            map.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        oooO00o.f85727OooO00o = map;
        List<InterfaceC25184OooOO0o> arrayList = oooO00o.f85727OooO00o.get("Accept");
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            oooO00o.f85727OooO00o.put("Accept", arrayList);
        }
        arrayList.add(oooO0O0);
        return new FiamImageRequestCreator((C22253OooOO0o) this.requestManager.OooOO0(new C25183OooOO0(str, new o00OoooO.OooOOO0(oooO00o.f85727OooO00o))).OooOO0());
    }
}
