/*
 * Copyright 2019 Dropbox.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arpnetworking.metrics.common.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;

/**
 * Interface for classes that handle the records polled by a kafka
 * {@code Consumer}.
 *
 * @param <T> the type of the value in the consumer records being handled
 *
 * @author Joey Jackson (jjackson at dropbox dot com)
 */
public interface ConsumerListener<T> {

    /**
     * Handles a consumer record from the consumer.
     *
     * @param record the consumer record to be handled
     */
    void handle(ConsumerRecord<?, T> record);

    /**
     * Handles a throwable from the consumer.
     *
     * @param throwable the throwable to be handled
     */
    void handle(Throwable throwable);
}
