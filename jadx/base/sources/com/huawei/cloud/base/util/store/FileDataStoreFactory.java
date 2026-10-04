package com.huawei.cloud.base.util.store;

import androidx.core.content.C21638OooO0Oo;
import com.huawei.cloud.base.util.IOUtils;
import com.huawei.cloud.base.util.Maps;
import com.huawei.cloud.base.util.Throwables;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class FileDataStoreFactory extends AbstractDataStoreFactory {
    private static final Logger LOGGER = Logger.getLogger(FileDataStoreFactory.class.getName());
    private final File dataDirectory;

    public static class FileDataStore<V extends Serializable> extends AbstractMemoryDataStore<V> {
        private final File dataFile;

        public FileDataStore(FileDataStoreFactory fileDataStoreFactory, File file, String str) throws IOException {
            super(fileDataStoreFactory, str);
            File file2 = new File(file, str);
            this.dataFile = file2;
            if (IOUtils.isSymbolicLink(file2)) {
                throw new IOException(C21638OooO0Oo.OooO00o(file2, "unable to use a symbolic link: "));
            }
            if (!file2.createNewFile()) {
                this.keyValueMap = (HashMap) IOUtils.deserialize(new FileInputStream(file2));
            } else {
                this.keyValueMap = Maps.newHashMap();
                save();
            }
        }

        @Override // com.huawei.cloud.base.util.store.AbstractMemoryDataStore
        public void save() throws IOException {
            IOUtils.serialize(this.keyValueMap, new FileOutputStream(this.dataFile));
        }

        @Override // com.huawei.cloud.base.util.store.AbstractDataStore, com.huawei.cloud.base.util.store.DataStore
        public FileDataStoreFactory getDataStoreFactory() {
            return (FileDataStoreFactory) super.getDataStoreFactory();
        }
    }

    public FileDataStoreFactory(File file) throws Throwable {
        File canonicalFile = file.getCanonicalFile();
        this.dataDirectory = canonicalFile;
        if (IOUtils.isSymbolicLink(canonicalFile)) {
            throw new IOException(C21638OooO0Oo.OooO00o(canonicalFile, "unable to use a symbolic link: "));
        }
        if (!canonicalFile.exists() && !canonicalFile.mkdirs()) {
            throw new IOException(C21638OooO0Oo.OooO00o(canonicalFile, "unable to create directory: "));
        }
        setPermissionsToOwnerOnly(canonicalFile);
    }

    public static void setPermissionsToOwnerOnly(File file) throws Throwable {
        try {
            Class cls = Boolean.TYPE;
            Method method = File.class.getMethod("setReadable", cls, cls);
            Method method2 = File.class.getMethod("setWritable", cls, cls);
            Method method3 = File.class.getMethod("setExecutable", cls, cls);
            Boolean bool = Boolean.FALSE;
            if (!((Boolean) method.invoke(file, bool, bool)).booleanValue() || !((Boolean) method2.invoke(file, bool, bool)).booleanValue() || !((Boolean) method3.invoke(file, bool, bool)).booleanValue()) {
                LOGGER.warning("unable to change permissions for everybody: " + file);
            }
            Boolean bool2 = Boolean.TRUE;
            if (((Boolean) method.invoke(file, bool2, bool2)).booleanValue() && ((Boolean) method2.invoke(file, bool2, bool2)).booleanValue() && ((Boolean) method3.invoke(file, bool2, bool2)).booleanValue()) {
                return;
            }
            LOGGER.warning("unable to change permissions for owner: " + file);
        } catch (IllegalAccessException e) {
            LOGGER.info(e.toString());
        } catch (IllegalArgumentException e2) {
            LOGGER.info(e2.toString());
        } catch (NoSuchMethodException unused) {
            LOGGER.warning("Unable to set permissions for " + file + ", likely because you are running a version of Java prior to 1.6");
        } catch (SecurityException e3) {
            LOGGER.info(e3.toString());
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            Throwables.propagateIfPossible(cause, IOException.class);
            throw new IOException(cause);
        }
    }

    @Override // com.huawei.cloud.base.util.store.AbstractDataStoreFactory
    public <V extends Serializable> DataStore<V> createDataStore(String str) throws IOException {
        return new FileDataStore(this, this.dataDirectory, str);
    }

    public final File getDataDirectory() {
        return this.dataDirectory;
    }
}
