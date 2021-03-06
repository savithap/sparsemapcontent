package org.sakaiproject.nakamura.lite.jdbc.postgresql;

import org.sakaiproject.nakamura.api.lite.Configuration;
import org.sakaiproject.nakamura.lite.lock.AbstractLockManagerImplTest;
import org.sakaiproject.nakamura.lite.storage.StorageClientPool;

public class LockManagerImplMan extends AbstractLockManagerImplTest {

    @Override
    protected StorageClientPool getClientPool(Configuration configuration) throws ClassNotFoundException {
        return PostgreSQLSetup.getClientPool(configuration);
    }

}
