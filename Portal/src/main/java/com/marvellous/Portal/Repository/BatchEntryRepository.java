package com.marvellous.Portal.Repository;

import com.marvellous.Portal.Entity.BatchEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepository extends MongoRepository<BatchEntry, ObjectId>
{
}
