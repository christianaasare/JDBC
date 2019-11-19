package JDBC;

import java.util.Date;
import java.util.List;

public interface SalesDAO {
        List<SalesTO> salesReport(Date date) throws ClassNotFoundException;
    }

